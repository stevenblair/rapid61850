package rapid61850;

public class JSONDatabaseManager {
	
	int itemNumber = 0;
	StringBuilder path = new StringBuilder("");

	public JSONDatabaseManager(String iedName) {
		path.append(iedName);
	}
	
	public void addItem() {
		itemNumber++;
	}
	
	public void addLayer() {
		path.append(".items"  + "[" + itemNumber + "]");
		itemNumber = 0;
	}
	
	public void popLayer() {
		int index = path.lastIndexOf(".items[");
		
		// get number from path
		itemNumber = Integer.parseInt(path.substring(index + 7, path.length() - 1));

//		System.out.println("old path: " + path);
		path = new StringBuilder(path.substring(0, index));
//		System.out.println("index: " + index + "; new path: " + path + "; itemNumber: " + itemNumber);
	}
	
	public String getPath() {
		return path.toString() + ".items[" + itemNumber + "]";
	}
}
