package algorithm;

public class Link {
	//������
	private long data;
	//ָ������
	private Link next;
	
	public Link (long data){
		this.data = data;
	}
	public long getData(){
		return data;
	}
	public void setData(long data){
		this.data = data;
	}
	public Link getNext(){
		return next;
	}
	public void setNext(Link obj){
		this.next = obj;
	}
}
