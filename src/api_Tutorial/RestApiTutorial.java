//package api_Tutorial;
//
//import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpRequest.BodyPublishers;
//
//public class RestApiTutorial {
//
//	public static void main(String[] args) throws Exception {
//		
//		Transcription trans = new Transcription();
//		trans.setAduio_Url("https://github.com/dkmartinez/api-test/blob/main/Thirsty.mp4?raw=true");
//		
//		//convert the object to a json 
//		Gson gson = new Gson();
//		String jsonRequest = gson.toJson(trans);
//		
//		System.out.println(jsonRequest);
//		
//		HttpRequest postRequest = HttpRequest.newBuilder()
//				.uri(new URI("https://api.assemblyai.com/v2/transcript"))
//				.header("Authorization", "18c744a765084f40840b693128331f53")
//				.POST(BodyPublishers.ofString(jsonRequest))
//				.build();
//		
//		
//		HttpClient httpClient = HttpClient.newHttpClient();
//		HttpResponse<String> postResponse = httpClient.send(postRequest, null);
//		
//		System.out.println(postResponse.body());
//		
//
//	}
//
//}
