package com.ssm.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.ssm.bean.User;

/**
 * Jackson 框架JSON、XML、List、Map直接相互转换
 * 参考：http://bugyun.iteye.com/blog/2278997
 * @author v_xbingtan
 *
 */
public class ToJson {
	private JsonGenerator jsonGenerator = null;  
    private ObjectMapper objectMapper = null;  
    
    public void init() {  
    	objectMapper = new ObjectMapper();
    	try {  
            jsonGenerator = objectMapper.getJsonFactory().createJsonGenerator(System.out, JsonEncoding.UTF8);
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }
    
    public String listToJson(List list) {
    	this.init();
    	String json = null;
    	try {
    		//jsonGenerator.writeObject(list1);
    		if(list.size() < 1) {
    			return null;
    		}
			json = objectMapper.writeValueAsString(list);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			this.destory();
		}
		return json;
    }
    
    public void destory() {  
        try {  
            if (jsonGenerator != null) {  
                jsonGenerator.flush();  
            }  
            if (!jsonGenerator.isClosed()) {  
                jsonGenerator.close();  
            }  
            jsonGenerator = null;  
            objectMapper = null;  
            System.gc();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }
}
