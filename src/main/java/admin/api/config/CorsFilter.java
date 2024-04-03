package admin.api.config;

import com.opl.commons.cors.CorsFilterUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

import jakarta.servlet.*;
import java.io.IOException;

@Component
public class CorsFilter implements Filter {
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {

		HttpServletResponse response = (HttpServletResponse) res;
		HttpServletRequest request = ((HttpServletRequest) req);
		boolean result = CorsFilterUtils.setHeader(response, request);
		if (!result) {
			chain.doFilter(req, res);
		}

	}

	public void init(FilterConfig filterConfig) {
	}

	public void destroy() {
	}

}
