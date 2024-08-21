
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        readFromFile rf=new readFromFile();
        String[][] purchaseOrders =rf.readFile(args[0]);

        List<orders> orderList=new ArrayList<>();
        int a=1;

        for (int i = 0; i < purchaseOrders.length; i++) {
            int count=0;

           for (int j=0;j<purchaseOrders[i].length;j++) {
               if (purchaseOrders[i][j]!=null)
                   count++;
           }

               int x = 2 * a;
               if (count == 5) {

                   orderList.add(new orders(purchaseOrders[i][0], purchaseOrders[i][1], purchaseOrders[i][2], purchaseOrders[i][3], Integer.parseInt(purchaseOrders[i][4])));
                   a=1;
               } else if (count > 5) {

                   orderList.add(new orders(purchaseOrders[i][0], purchaseOrders[i][1], purchaseOrders[i][2], purchaseOrders[i][3], Integer.parseInt(purchaseOrders[i][4])));
                   purchaseOrders[i][3] = purchaseOrders[i][3 + x];
                   purchaseOrders[i][3 + x] = null;
                   purchaseOrders[i][4] = purchaseOrders[i][4 + x];
                   purchaseOrders[i][4 + x] = null;
                   i--;
                   a++;

               }


         }

        readFromFile rf2=new readFromFile();
        String[][] priceCatalog =rf2.readFile(args[1]);
        List<bookInfo> bookList=new ArrayList<>();

        for (int x=0;x< priceCatalog.length;x++){
            bookList.add(new bookInfo(priceCatalog[x][0],priceCatalog[x][1],priceCatalog[x][2],priceCatalog[x][3],Double.parseDouble(priceCatalog[x][4])));
        }

        orders.displayBill(orderList,bookList);

    }


    }



