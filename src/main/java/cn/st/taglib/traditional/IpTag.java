package cn.st.taglib.traditional;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
/**
 * <p>
 * description:自定义标签，用于显示客户端Ip
 * </p>
 * @author st
 *
 */
@SuppressWarnings("serial")
public class IpTag extends TagSupport{

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		HttpServletRequest request=(HttpServletRequest) this.pageContext.getRequest();
		JspWriter out=this.pageContext.getOut();
		try {
			out.print(request.getRemoteAddr());
		} catch (IOException e) {
			//抛出运行时异常
			throw new RuntimeException(e);
		}
		return super.doStartTag();
	}

}
