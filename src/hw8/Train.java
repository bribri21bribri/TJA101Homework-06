package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Train implements Comparable<Train>{
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public Train(int number, String type, String start, String dest, double price) {
		super();
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public int compareTo(Train aTrain) {
		if (this.number > aTrain.number) {
			return 1;
		} else if(this.number == aTrain.number){
			return 0;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Train [number=" + number + ", type=" + type + ", start=" + start + ", dest=" + dest + ", price=" + price
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}

	public static void main(String[] args) {
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
		
		// 請寫一隻程式,能印出不重複的Train物件
		HashSet<Train> trainHashSet = new HashSet<>();
		trainHashSet.add(t1);
		trainHashSet.add(t2);
		trainHashSet.add(t3);
		trainHashSet.add(t4);
		trainHashSet.add(t5);
		trainHashSet.add(t6);
		trainHashSet.add(t7);
		Iterator<Train> it = trainHashSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// 請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
		List<Train> trainList = new ArrayList<>();
		trainList.add(t1);
		trainList.add(t2);
		trainList.add(t3);
		trainList.add(t4);
		trainList.add(t5);
		trainList.add(t6);
		trainList.add(t7);
		Collections.sort(trainList);
		for (Train train : trainList) {
			System.out.println(train);
		}
		// 承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
		Set<Train> trainTreeSet = new TreeSet<>();
		trainTreeSet.add(t1);
		trainTreeSet.add(t2);
		trainTreeSet.add(t3);
		trainTreeSet.add(t4);
		trainTreeSet.add(t5);
		trainTreeSet.add(t6);
		trainTreeSet.add(t7);
		for (Train train : trainTreeSet) {
			System.out.println(train);
		}
		
	}
}
