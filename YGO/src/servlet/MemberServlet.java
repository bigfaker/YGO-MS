package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/MemberServlet")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String users[] = request.getParameterValues("check");// ���������ǰ̨�����ı�ѡ�еĸ�ѡ���ֵ
		out.println("user[0]��ֵ�ǣ�" + users[0]);
		if (users.length != 0) 
			 {
			MemberDAO Memberdao = new MemberDAO();
			int m = 0;
			for (int i = 0; i < users.length; i++) {// ѭ��ɾ����ѡ�е�����
				int id = Integer.parseInt(users[i]);
				m = Memberdao.deleteByQQ(id);
				// ɾ��һ���û���ͬʱҪɾ����������ͨѶ¼(�����û�userid=id��ɾ��)
				// System.out.println(id);
				// n=telDao.deleteTelByUser(id);
			}

			if (m > 0) {// �ɹ�
				out.println("<script>alert('ɾ���ɹ���');window.location.href='Member/Delete-Member.jsp'</script>");
				out.close();
			} else {// ʧ��
				out.println("<script>alert('ɾ��ʧ�ܣ������ԣ�');window.location.href='Member/Delete-Member.jsp'</script>");
				out.close();
			}
		}
	}
}