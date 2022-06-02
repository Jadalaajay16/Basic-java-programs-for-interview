
 class vehicle {
	public void drive()
	{System.out.println("vehicle drive");}
}

 class Car extends vehicle{
	public void drive()
	{System.out.println("car drive");}
}

	
	 class question{
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			vehicle v=	new vehicle();
			v.drive();
			
	}

}
