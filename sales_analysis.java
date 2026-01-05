int maxSales = 0;
String bestProduct = "";

for (int i = 1; i < sales.length; i++) {

    if (sales[i] > maxSales) {
        maxSales = sales[i];
        bestProduct = products[i];
    }
}

System.out.println("Best Selling Product: " + bestProduct);
