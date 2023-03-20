package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import formbeans.Student;

public class StudentRegController extends Action{
	public StudentRegController() {
		System.out.println("StudentRegController .....");
	}

	@Override
	public ActionForward execute(ActionMapping actionMapping, ActionForm bean, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Student student = (Student)bean;
		System.out.println("----> Student name     : "+student.getName());
		System.out.println("----> Student email    : "+student.getEmail());
		System.out.println("----> Student address  : "+student.getAddress());
		
		bean.reset(actionMapping, request);
		return actionMapping.findForward("success");
	}
	
}
