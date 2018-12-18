package Json.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;
import net.sf.json.util.JSONStringer;

/**
 * Servlet implementation class data
 */
@WebServlet("/data")
public class data extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public data() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		List<Product> list=new ArrayList<Product>();
		list.add(new Product("麻辣鸭脖1", "精品鸭脖选择六和品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和"
				+ "品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和品牌的一级樱桃谷"
				+ "鸭，无淤血。无表皮破损", 23.00,"http://192.168.43.184:8080/JsonService/Imge/qw.png"));
		list.add(new Product("麻辣鸭脖2", "精品鸭脖选择六和品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和"
				+ "品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和品牌的一级樱桃谷"
				+ "鸭，无淤血。无表皮破损", 23.00,"http://192.168.43.184:8080/JsonService/Imge/wqd.png"));
		
		list.add(new Product("麻辣鸭脖3", "精品鸭脖选择六和品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和"
				+ "品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和品牌的一级樱桃谷"
				+ "鸭，无淤血。无表皮破损4", 23.00,"http://192.168.43.184:8080/JsonService/Imge/flash568.jpg"));
		list.add(new Product("麻辣鸭脖5", "精品鸭脖选择六和品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和"
				+ "品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和品牌的一级樱桃谷"
				+ "鸭，无淤血。无表皮破损6", 23.00,"http://192.168.43.184:8080/JsonService/Imge/flash5648.jpg"));
		list.add(new Product("麻辣鸭脖8", "精品鸭脖选择六和品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和"
				+ "品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和品牌的一级樱桃谷"
				+ "鸭，无淤血。无表皮破损", 23.00,"http://192.168.43.184:8080/JsonService/Imge/flash5648.jpg"));
		list.add(new Product("9safasfchenqiao", "精品鸭脖选择六和品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和"
				+ "品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和品牌的一级樱桃谷"
				+ "鸭，无淤血。无表皮破损", 23.00,"http://192.168.43.184:8080/JsonService/Imge/flash5648.jpg"));
		list.add(new Product("麻辣鸭脖0", "精品鸭脖选择六和品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和"
				+ "品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和品牌的一级樱桃谷"
				+ "鸭，无淤血。无表皮破损", 23.00,"http://192.168.43.184:8080/JsonService/Imge/flash5648.jpg"));
		list.add(new Product("麻辣鸭脖12", "精品鸭脖选择六和品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和"
				+ "品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和品牌的一级樱桃谷"
				+ "鸭，无淤血。无表皮破损11", 23.00,"http://192.168.43.184:8080/JsonService/Imge/flash5648.jpg"));
		list.add(new Product("麻辣鸭脖", "精品鸭脖选择六和品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和"
				+ "品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和品牌的一级樱桃谷"
				+ "鸭，无淤血。无表皮破损13", 23.00,"http://192.168.43.184:8080/JsonService/Imge/flash5648.jpg"));
		list.add(new Product("麻辣鸭脖13", "精品鸭脖选择六和品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和"
				+ "品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和品牌的一级樱桃谷"
				+ "鸭，无淤血。无表皮破损", 23.00,"http://192.168.43.184:8080/JsonService/Imge/flash5648.jpg"));
		list.add(new Product("麻辣鸭脖14", "精品鸭脖选择六和品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和"
				+ "品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和品牌的一级樱桃谷"
				+ "鸭，无淤血。无表皮破损", 23.00,"http://192.168.43.184:8080/JsonService/Imge/flash5648.jpg"));
		list.add(new Product("麻辣鸭脖15", "精品鸭脖选择六和品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和"
				+ "品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和品牌的一级樱桃谷"
				+ "鸭，无淤血。无表皮破损", 23.00,"http://192.168.43.184:8080/JsonService/Imge/flash5648.jpg"));
		list.add(new Product("麻辣鸭脖16", "精品鸭脖选择六和品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和"
				+ "品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和品牌的一级樱桃谷"
				+ "鸭，无淤血。无表皮破损", 23.00,"http://192.168.43.184:8080/JsonService/Imge/flash5648.jpg"));
		list.add(new Product("麻辣鸭脖17", "精品鸭脖选择六和品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和"
				+ "品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和品牌的一级樱桃谷"
				+ "鸭，无淤血。无表皮破损", 23.00,"http://192.168.43.184:8080/JsonService/Imge/flash5648.jpg"));
		list.add(new Product("麻辣鸭脖18", "精品鸭脖选择六和品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和"
				+ "品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和品牌的一级樱桃谷"
				+ "鸭，无淤血。无表皮破损18", 23.00,"http://192.168.43.184:8080/JsonService/Imge/flash5648.jpg"));
		list.add(new Product("麻辣鸭脖", "精品鸭脖选择六和品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和"
				+ "品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和品牌的一级樱桃谷"
				+ "鸭，无淤血。无表皮破损", 23.00,"http://192.168.43.184:8080/JsonService/Imge/flash5648.jpg"));
		list.add(new Product("麻辣鸭脖19", "精品鸭脖选择六和品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和"
				+ "品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和品牌的一级樱桃谷"
				+ "鸭，无淤血。无表皮破损", 23.00,"http://192.168.43.184:8080/JsonService/Imge/flash5648.jpg"));
		list.add(new Product("麻辣鸭脖20", "精品鸭脖选择六和品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和"
				+ "品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和品牌的一级樱桃谷"
				+ "鸭，无淤血。无表皮破损", 23.00,"http://192.168.43.184:8080/JsonService/Imge/flash5648.jpg"));
		list.add(new Product("麻辣鸭脖21", "精品鸭脖选择六和品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和"
				+ "品牌的一级樱桃谷鸭，无淤血。无表皮破损精品鸭脖选择六和品牌的一级樱桃谷"
				+ "鸭，无淤血。无表皮破损", 23.00,"http://192.168.43.184:8080/JsonService/Imge/flash5648.jpg"));
		
		JSONStringer stringer=new JSONStringer();
		JSONObject object =new JSONObject();
		try {
		stringer.array();
		for(Product pro:list) {
			stringer.object().key("title").value(pro.title).
			key("desc").value(pro.desc).key("price").value(pro.price).key("image").value(pro.imgUrl)
			.endObject();
			
		}
		
		stringer.endArray();
		object.element("pro", stringer.toString());
		}catch(Exception e) {
			e.printStackTrace();
			
		}

		response.getOutputStream().write(object.toString().getBytes("UTF-8"));
		response.setContentType("text/json;charset=UTF-8");
		response.getOutputStream();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
