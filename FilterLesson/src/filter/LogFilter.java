package filter;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class LogFilter implements Filter {


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		ServletContext application=request.getServletContext();
		Date current=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		String path="/WEB-INF/data/"+sdf.format(current).toString()+".log";
		FileOutputStream fos=new FileOutputStream(application.getRealPath(path),true);//第2引数true=追記
		System.out.println(application.getRealPath(path));

		OutputStreamWriter osw=new OutputStreamWriter(fos,"utf-8");
		BufferedWriter bw=new BufferedWriter(osw);
		sdf=new SimpleDateFormat("HH:mm:ss");
		bw.write(sdf.format(current));
		bw.write("\t");
		bw.write(((HttpServletRequest)request).getServletPath());
		bw.write("\t");
		bw.write(((HttpServletRequest)request).getHeader("user-agent"));
		bw.newLine();
		bw.close();

		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

	public void destroy() {
	}

}
