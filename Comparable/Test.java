package Comparable;

public class Test {
    public static void main (String[] args) {

        Contact[] friends = new Contact[8];

        friends[0] = new Contact ("John", "Smith", "610-555-7324");
        friends[1] = new Contact ("John", "Smith", "610-555-7324");
        friends[2] = new Contact ("Mark", "Riley", "733-555-2969");
        friends[3] = new Contact ("Laura", "Getz", "663-555-3984");
        friends[4] = new Contact ("Larry", "Saith", "464-555-3489");
        friends[5] = new Contact ("Frank", "Phelps", "322-555-2284");
        friends[6] = new Contact ("Mario", "Guzman", "804-555-9066");
        friends[7] = new Contact ("Harsha", "Grant", "243-555-2837");
        Sorting.selectionSort(friends);
        for (int i = 0; i < friends.length; i++)
            System.out.println (friends[i]);

        PhanSo[] ps = new PhanSo[3];
        ps[0] = new PhanSo (3,2);
        ps[1] = new PhanSo (1,2);
        ps[2] = new PhanSo (12,24);
        Sorting.selectionSort(ps);
        for (int i = 0; i < ps.length; i++)
            System.out.println (ps[i]);    
    }
}
