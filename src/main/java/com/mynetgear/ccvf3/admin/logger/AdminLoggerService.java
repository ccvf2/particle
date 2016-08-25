package com.mynetgear.ccvf3.admin.logger;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.mynetgear.ccvf3.HomeController;

@Component
public class AdminLoggerService implements AdminLoggerServiceImp{
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private AdminLoggerDAO adminLoggerDAO;
	
	@Override
	public int insertAdminLogger(AdminLoggerDTO adminLoggerDTO) {
		//String category = adminLoggerDTO.getAdminlog_cat();
		logger.debug("insertAdminLogger Method start");
		
		return adminLoggerDAO.insertAdminLogger(adminLoggerDTO);
	}

	@Override
	public List<AdminLoggerDTO> getAdminLoggerList() {
		logger.debug("getAdminLoggerList Method start");
		
		return adminLoggerDAO.getAdminLoggerList();
	}

	@Override
	public void deleteAdminLogger(ModelAndView mav) {
		logger.debug("deleteAdminLogger Method start");
		Map<String, Object> map = mav.getModelMap();
		// request 요청은 아직 필요없다
		//HttpServletRequest request = (HttpServletRequest) map.get("request");
		HttpServletResponse response = (HttpServletResponse) map.get("response");
		
		//삭제하고 결과값 확인
		int check = adminLoggerDAO.deleteAdminLogger();
		
		try {
			response.setContentType("application/html;charset=utf8");
			PrintWriter out = response.getWriter();
			out.print(check);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
