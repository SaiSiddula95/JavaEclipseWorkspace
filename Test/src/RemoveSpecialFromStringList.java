import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveSpecialFromStringList {

	private int id;
	private String dxCd;
	
	
	
	public RemoveSpecialFromStringList(int id, String dxCd) {
		super();
		this.id = id;
		this.dxCd = dxCd;
	}
	
	public RemoveSpecialFromStringList() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDxCd() {
		return dxCd;
	}
	public void setDxCd(String dxCd) {
		this.dxCd = dxCd;
	}
	
	
	public static void main(String[] args) {
		RemoveSpecialFromStringList r1 = new RemoveSpecialFromStringList(0,"126");
		RemoveSpecialFromStringList r2 = new RemoveSpecialFromStringList(1,"126.");
		RemoveSpecialFromStringList r3 = new RemoveSpecialFromStringList(2,"126");
		RemoveSpecialFromStringList r4 = new RemoveSpecialFromStringList(3,"129");
		RemoveSpecialFromStringList r5 = new RemoveSpecialFromStringList(4,"1.29");
		RemoveSpecialFromStringList r6 = new RemoveSpecialFromStringList(5,null);
		
		List<RemoveSpecialFromStringList> rList = new ArrayList<RemoveSpecialFromStringList>();
		List<String> sList = new ArrayList<String>();
		
		//rList = rList.stream().map(s -> s.getDxCd().replaceAll(".", "")).collect(Collectors.toList());
		sList.add(" 126.");
		sList.add("129.");
		sList.add("C92");
		sList.add("");
		sList.add(null);
		
		sList.remove(null);
		
		rList.add(r1);
		rList.add(r2);
		rList.add(r3);
		rList.add(r4);
		rList.add(r5);
		rList.add(r6);
		
		for(String tempS : sList)	System.out.println(tempS);
			
		
		//sList = sList.stream().map(s -> s.replaceAll("\\.", "")).collect(Collectors.toList());
		sList = sList.stream().map(s -> s.replaceAll("\\.", "")).map(a -> a.trim()).collect(Collectors.toList());

		for(String tempS : sList)	System.out.println(tempS);
		
		//rList = rList.stream().map(s -> s.getDxCd().replaceAll("\\.", "")).collect(Collectors.to());
		
		rList = rList.stream().map(temp -> {
			RemoveSpecialFromStringList tempRe = temp;
			
			if(!isEmpty(tempRe.getDxCd())) {
				tempRe.setDxCd(temp.getDxCd().replaceAll("\\.", "").trim());	
			}else {
				System.out.println("Found null");
			}
							
			return tempRe;			
		}).collect(Collectors.toList());
		
		
		
		System.out.println("After Map");
		for(String tempS : sList) System.out.println(tempS);
		System.out.println();
		
		
		for(RemoveSpecialFromStringList temp: rList) {
			
			if(sList.stream().filter(x -> x.equalsIgnoreCase(temp.getDxCd())).collect(Collectors.toList()).size()>0) {
				System.out.println("ID: "+ temp.getId() + ", Dx Cd: "+temp.getDxCd());
			}
			
			
		}
		
		
		
		
		
		
		
	}
	
	public static boolean isEmpty(String s) {
		return ((s==null) || s.trim().contentEquals(""));
	}
	
}
