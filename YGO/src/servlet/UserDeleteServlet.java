package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import dao.JudgmentDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserDeleteServlet extends HttpServlet {

	/**
		 * 
		 */
	private static final long serialVersionUID = 2239259317586651689L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 处理乱码
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String users[] = request.getParameterValues("check");// 用数组接受前台传来的被选中的复选框的值
		out.println("user[0]的值是：" + users[0]);
		if (users.length != 0) 
			 {
			JudgmentDAO judgmentdao = new JudgmentDAO();
			int m = 0;
			for (int i = 0; i < users.length; i++) {// 循环删除被选中的数据
				int id = Integer.parseInt(users[i]);
				m = judgmentdao.deleteByQQ(id);
				// 删除一个用户，同时要删除他所属的通讯录(根据用户userid=id来删除)
				// System.out.println(id);
				// n=telDao.deleteTelByUser(id);
			}

			if (m > 0) {// 成功
				out.println("<script>alert('删除成功！');window.location.href='Judgment/Delete-Judgment.jsp'</script>");
				out.close();
			} else {// 失败
				out.println("<script>alert('删除失败，请重试！');window.location.href='Judgment/Delete-Judgment.jsp'</script>");
				out.close();
			}
		}
	}
}
