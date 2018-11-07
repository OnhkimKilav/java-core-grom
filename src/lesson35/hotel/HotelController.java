package lesson35.hotel;

/**
 * Created by Valik on 05.11.2018.
 */
public class HotelController {
    private HotelService hotelService = new HotelService();

    public StringBuffer findHotelByName(String name) throws Exception {
        return hotelService.findHotelByName(name);
    }

    public StringBuffer findHotelByCity(String city) throws Exception {
        return hotelService.findHotelByCity(city);
    }
}