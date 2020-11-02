class StateRoadTax{
public static void main(String args[])
{
int vehiclePrice=80000;
String state="VC";
switch(state)
{
case "KA":float kaRoadTax=0.18f*vehiclePrice;
           System.out.println(kaRoadTax);
              break;
case "AP":float apRoadTax=0.20f*vehiclePrice;
           System.out.println(apRoadTax);
              break;
case "TN":float tnRoadTax=0.28f*vehiclePrice;
           System.out.println(tnRoadTax);
              break;
case "UP":float upRoadTax=0.25f*vehiclePrice;
           System.out.println(upRoadTax);
              break;
case "HP":float hpRoadTax=0.30f*vehiclePrice;
           System.out.println(hpRoadTax);
              break;
case "DL":float dlRoadTax=0.31f*vehiclePrice;
           System.out.println(dlRoadTax);
              break;
default:System.out.println("select from KA,AP,TN,UP,HP,DL");
}
}
}