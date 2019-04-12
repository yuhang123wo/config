/**
 * 
 */
package cn.yh.user.config.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.web.bind.annotation.Mapping;


/**
 * @author yuhang
 * @date 2019年4月11日
 * @desc
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Mapping
@Documented
public @interface SecurityParameter {

	/**
	 * 入参是否解密，默认解密
	 */
	boolean inDecode() default true;

	/**
	 * 出参是否加密，默认加密
	 */
	boolean outEncode() default true;
}