import java.util.ArrayList;
import java.util.Scanner;

public class ChuoiDaiNhat{
    public static void timChuoiCoDoDaiDaiNhat(String chuoi) {
        ArrayList<Character> arrayList = new ArrayList();
        ArrayList<Character> arrayList1 = new ArrayList();
        for (int i = 0; i < chuoi.length() - 1; i++) {
            if (i > 0) {
                if (chuoi.charAt(i) > chuoi.charAt(i - 1)) {
                    continue;
                }
            }
            arrayList.clear();
            arrayList.add(chuoi.charAt(i));
            for (int j = i + 1; j < chuoi.length(); j++) {
                if (chuoi.charAt(j) > arrayList.get(arrayList.size() - 1)) {
                    arrayList.add(chuoi.charAt(j));
                }else break;
            }
            if (arrayList.size() > arrayList1.size()) {
                arrayList1.clear();
                arrayList1.addAll(arrayList);
            }
        }
        for (Character a : arrayList1) {
            System.out.print(a);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi");
        String a = scanner.nextLine();
        ChuoiDaiNhat.timChuoiCoDoDaiDaiNhat(a);
    }
}
