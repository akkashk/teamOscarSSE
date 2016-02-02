package uk.ac.cam.teamOscarSSE;

public abstract class Order {
	//stock whose order book this object will belong to
	private final Stock stock;

	//indicates whether order is for buying or selling
	private final OrderType orderType;

	//identifying party who placed order
	private final String id;

	//number of shares
	private int shares;

	//price that buyer/seller asking for
	private double price;

	//unique order number
	private final long orderNum;

	//time of order
	private final long time;

	Order(OrderType type, String playerToken, Stock stock, int size, double price) {
		this.orderType = type;
		this.id = playerToken;
		this.stock = stock;
		this.shares = size;
		this.price = price;
		this.time = System.currentTimeMillis();
		this.orderNum = IDGenerator.getID();
	}

	public String getId() {
		return id;
	}

	public int getShares() {
		return shares;
	}

	public void setShares(int shares) {
		this.shares = shares;
	}

	public double getPrice() {
		return price;
	}

	public long getOrderNum() {
		return orderNum;
	}

	public long getTime() {
		return time;
	}

	public Stock getStock() {
		return stock;
	}

	public OrderType getOrderType() {
		return orderType;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return String.format("{'id':%d,'stock':'%s','type':'%s','size':%d,'price':%f}",
				orderNum, stock.getSymbol(), orderType, shares, price);
	}

}