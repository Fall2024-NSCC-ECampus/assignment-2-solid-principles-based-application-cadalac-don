import static java.lang.System.exit;

int companyID;
int customerID;


public void main(String[] args)
{
    //starts program here with the customer
    customer.orderingItem();
}

public class customer{
    public void orderingItem() {
        //input customer info and order - Phone number is string for extension # info
        String customerName, phoneNumber, customerAddress, shippingAddress, itemPhone;
        int quantity;

        System.out.println("Look for item - check potential places to shop at");
        checkAvailability(companyID);
    }
    public void checkAvailability(int companyID){
        //based on availability and location, we can continue
        String companyName, companyAddress;
        int stockQuantity;
        store.reviews;
    }
}

public class store extends customer {

    public void reviews() {
        //reviews for company and phone
        pickupTicket(companyID);
    }

    public void pickupTicket(int companyID) {

        int payment;
        int paymentReceived;
        int shippingHubRates;
        int CreditCardInfo;

        //choice where the phone come from
        switch (companyID) {
            case 0:
                cargoManufacturingDealer(companyID);
                checkAvailability(companyID);

            case 1:
                shipment.orderShipment();
                checkAvailability(companyID);

            default:
                System.out.println("Error - Try Again");
        }

        public void checkStoreAvailability(int companyID) {
            //based on availability - the store verify it has the phone
            String companyName, companyAddress;
            int stockQuantity;
            reviews();
        }
    }

    public void cargoManufacturingDealer(int companyID) {
        //store choose the option
        switch (companyID) {
            case 0:
                //maybe there is no stock - online stock values is incorrect
                //maybe app issue?
                manageStock();

            case 1:
                //otherwise ship order
                shipment.dispatchOrder();

            default:
                //something weird happened
                System.out.println("Error - Try Again");
        }
    }

    public void manageStock() {
        //Is there an issue to send a phone?
        String itemPhone;
        int quantity;
        System.out.println("Unable to deliver - try again later");
    }
}

public class shipment extends customer {
    public void orderShipment() {
        //order is getting ready to be shipped
        packageDetails();
    }

    public void packageDetails() {
        //how much does the box weigh and what size for shipping details
        deliveryDetails();
    }

    public void deliveryDetails() {
        //I should get delivery info from customer input
        dispatchOrder();
    }

    public void dispatchOrder() {
        //order should be picked up by appropriate shipper
        //track at any time
        deliverOrder();
        trackOrder();
    }

    public void deliverOrder() {
        switch (customerID) {
            //we should be able to track at any time
            case 0:
                //order issue
                returnOrder();
                trackOrder();

            case 1:
                //order is fine
                received();
                trackOrder();

            default:
                //an unknown error - maybe lost at the post office? or invalid address?
                System.out.println("Delivery address is invalid");
        }
    }

    public void returnOrder() {
        //order is returned and do nothing else - refund is assumed
        System.out.println("Order is returned");
        trackOrder();
        //return order to company
        received();
    }

    public void received() {
        //you can still see status as completed with receipt
        //maybe give an option to exit program or track package - maybe someone is away
        //Two places to get potentially delivered to: customer or getting returned
        System.out.println("Delivered");
        trackOrder();
        exit(0);
    }

    public void trackOrder() {
        //add next tracking number function - but I just set it to something for now
        int trackingNumber = 1234567890;
        System.out.println("Your order is at this location with tracking number " + trackingNumber);
    }
}