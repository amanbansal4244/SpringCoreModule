public class Address {
	
	 private String flatNo;
	 private String street;
	 public String getFlatNo() {
	  return flatNo;
	 }
	 public void setFlatNo(String flatNo) {
	  this.flatNo = flatNo;
	 }
	 public String getStreet() {
	  return street;
	 }
	 public void setStreet(String street) {
	  this.street = street;
	 }
	 @Override
	 public String toString() {
	  return "Address [flatNo=" + flatNo + ", street=" + street + "]";
	 }
  
}