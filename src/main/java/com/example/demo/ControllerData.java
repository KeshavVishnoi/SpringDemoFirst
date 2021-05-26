//package com.example.demo;
//
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class ControllerData {
//	public Post curr;
//	static class Post{
//		private int id;
//		private String name;
//		
////		public Post(int id, String name) {
////			this.setId(id);
////			this.setName(name);
////		}
//
//		@Override
//		public String toString() {
//			return "Post [id = " + id + ", name = " + name + "]";
//		}
//
//		public String getName() {
//			return name;
//		}
//
//		public void setName(String name) {
//			this.name = name;
//		}
//
//		public int getId() {
//			return id;
//		}
//
//		public void setId(int id) {
//			this.id = id;
//		}
//	}
//	@CrossOrigin
//	@GetMapping("data")
//	public String yes(){
////		System.out.print("hey in data");
//		return "returning data";
//	}
//
//	@CrossOrigin
//	@GetMapping("/user")
//	public Post sendUser(){
////		System.out.print("hey in data");
//		return curr;
//	}
//	
//	@CrossOrigin
//	@RequestMapping(value = "/addPerson", method = RequestMethod.POST)
//    public Post addUser( @RequestBody Post post ) {
//    		System.out.println(post.toString());
//    		curr = post;
//    		return post;
//    }
//	
//	
//}
