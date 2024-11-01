// NameComparator.java

public class NameComparator implements Comparator<User>{
    public int compare(User a, User b){
        return a.name.compareTo(b.name);
    }
}
