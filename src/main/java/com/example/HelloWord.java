public class HelloWord{

private String greeting = "Hello!";

private String someone = "skyline";

public String getGreeting(){
	return this.greeting;
}

public void setGreeting(String greeting){
	this.greeting = greeting;
}

public String getSomeone(){
	return this.someone;
}

public void setSomeone(String someone){
	this.someone = someone;
}


public String sayHello(){
	return this.greeting + " " + this.someone;
}

}
