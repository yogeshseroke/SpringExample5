package uao;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import bao.SubLogic;
import dao.Subtraction;

public class SubtractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res=new ClassPathResource("applicationContext.xml");
		BeanFactory bf=new XmlBeanFactory(res);
		Subtraction s=(Subtraction)bf.getBean("sub");
		int i=new SubLogic().sub(s.getA(),s.getB());
		System.out.println(i);
	}

}
