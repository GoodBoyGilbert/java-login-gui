import java.util.HashMap;

public class IDandPasswords {

  HashMap<String,String> logininfo = new HashMap<String,String>();

  IDandPasswords(){

    logininfo.put("User", "password");
    logininfo.put("admin", "password");
    logininfo.put("superadmin", "abc123");

  }

  protected HashMap getLogininfo() {
    return logininfo;
  }
  
}
