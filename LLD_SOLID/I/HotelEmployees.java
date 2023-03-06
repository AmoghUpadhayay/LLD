package I;


// these functions are for different type of employees so creating class of waiter and having some functions like
// cookFood() or antiTheft() won't be of any use . Thus create segmented interface so that client do not have to implement
// unnecessary functions
public interface HotelEmployees {
    public void serveOrder();
    public void cookFood();
    public void cleanTable();
    public void antiTheft();
}
