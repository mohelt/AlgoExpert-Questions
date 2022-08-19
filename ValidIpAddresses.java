import java.util.*;

class Program {

  public ArrayList<String> validIPAddresses(String string) {
    
    ArrayList<String> ipAddressesFound = new ArrayList<String>();

    for(int i=1;i<Math.min(string.length(),4);i++){
      String[]  currentIPAddressParts = new String[] {"","","",""};
      currentIPAddressParts[0] = string.substring(0,i);
        if( !isValid(currentIPAddressParts[0])){
          continue;
        }
      for (int j=i+1;j<i + Math.min((int)  string.length() - i,4);j++){
        currentIPAddressParts[1] = string.substring(i, j);
        if( !isValid(currentIPAddressParts[1])){
          continue;
        }
    for (int k=j+1;k<j+ Math.min((int) string.length() - j,4);k++){
        currentIPAddressParts[2] = string.substring(j,k);
        currentIPAddressParts[3] = string.substring(k);
        if(isValid(currentIPAddressParts[2]) && isValid(currentIPAddressParts[3])){
          ipAddressesFound.add(join(currentIPAddressParts));
        }
    }
      }
    }
    return ipAddressesFound;
  }
  public static boolean isValid(String string){
    int stringAsInt = Integer.parseInt(string);
    if (stringAsInt > 255) {
      return false;
    }
    return string.length() == Integer.toString(stringAsInt).length();
  }
   public static String join(String[] strings){
     StringBuilder sb = new StringBuilder();
     for(int x=0;x<strings.length;x++){
       sb.append(strings[x]);
       if(x<strings.length -1){
         sb.append(".");
       }
  }
       return sb.toString();
}
}
