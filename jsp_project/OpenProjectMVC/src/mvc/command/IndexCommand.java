package mvc.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexCommand implements Command {

	@Override
	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {
		return "/WEB-INF/view/index.jsp";
	}

}
