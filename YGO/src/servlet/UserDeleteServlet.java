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
		// ��������
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String users[] = request.getParameterValues("check");// ���������ǰ̨�����ı�ѡ�еĸ�ѡ���ֵ
		out.println("user[0]��ֵ�ǣ�" + users[0]);
		if (users.length != 0) 
			 {
			JudgmentDAO judgmentdao = new JudgmentDAO();
			int m = 0;
			for (int i = 0; i < users.length; i++) {// ѭ��ɾ����ѡ�е�����
				int id = Integer.parseInt(users[i]);
				m = judgmentdao.deleteByQQ(id);
				// ɾ��һ���û���ͬʱҪɾ����������ͨѶ¼(�����û�userid=id��ɾ��)
				// System.out.println(id);
				// n=telDao.deleteTelByUser(id);
			}

			if (m > 0) {// �ɹ�
				out.println("<script>alert('ɾ���ɹ���');window.location.href='Judgment/Delete-Judgment.jsp'</script>");
				out.close();
			} else {// ʧ��
				out.println("<script>alert('ɾ��ʧ�ܣ������ԣ�');window.location.href='Judgment/Delete-Judgment.jsp'</script>");
				out.close();
			}
		}
	}
}
