package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TeamDAO;

/**
 * Servlet implementation class TeamServlet
 */
@WebServlet("/TeamServlet")
public class TeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String users[] = request.getParameterValues("check");// ���������ǰ̨�����ı�ѡ�еĸ�ѡ���ֵ
		out.println("user[0]��ֵ�ǣ�" + users[0]);
		if (users.length != 0) 
			 {
			TeamDAO Suspenddao = new TeamDAO();
			int m = 0;
			for (int i = 0; i < users.length; i++) {// ѭ��ɾ����ѡ�е�����
				String id = users[i];
				m = Suspenddao.deleteByTS(id);
				// ɾ��һ���û���ͬʱҪɾ����������ͨѶ¼(�����û�userid=id��ɾ��)
				// System.out.println(id);
				// n=telDao.deleteTelByUser(id);
			}

			if (m > 0) {// �ɹ�
				out.println("<script>alert('ɾ���ɹ���');window.location.href='Team/Delete-Team.jsp'</script>");
				out.close();
			} else {// ʧ��
				out.println("<script>alert('ɾ��ʧ�ܣ������ԣ�');window.location.href='Team/Delete-Team.jsp'</script>");
				out.close();
			}
		}
	}
}