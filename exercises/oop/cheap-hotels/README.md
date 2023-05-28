There are hotel booking services such as Booking, Kayak, Ostrovok. Each of them has some kind of commission and pricing
policy. During this task we have to implement an API that works with these services and search for the best offer out
of them. Our service must show the fair price, taking into account all commissions and conversions.

Pricing policy for services (all coincidences are random):

- Ostrovok: price should be increased by 12% tax paid for each booking
- Booking: price should be converted from dollars to roubles at the rate of 1:75
- Kayak: no change, shows final and convenient price for us

Hotel description in each service looks the same:
```
Map<String, Object> hotel = Map.of(
    "name", "bestHotel",
    "cost", 600.5
);

System.out.println(hotel); // => {name=bestHotel, cost=600.5}
```
\
In the ```Gateway``` class, implement a public ```findAll()``` method that handles data from different booking services.
It should set a price for each one, taking into account the coefficient of that service. The service returns a list of
hotels and services in the condition. The data to be processed is contained in the ```hotelsByService``` class field
```
Gateway gateway = new Gateway();

// Hotel prices are returning in a normalised form
// An array of hotels is returning merged with the name of the service from which they are extracted
List<Map<String, Object>> hotelInfos = gateway.findAll();

System.out.println(hotelInfos);
// =>
// [
//     {hotel={name=hexletInn, cost=672.0}, service=ostrovok},
//     {hotel={name=hexletInn, cost=1125.0}, service=booking}
// ]
```
The gateway supports filtering by minimum and maximum price:
```
// Min and max are not set by default, but can be specified
Map<String, Integer> predicates = Map.of(
    "min", 200,
    "max", 300
);

List<Map<String, Object>> hotelInfos = gateway.findAll(predicates);

// Only one of the predicates can be specified - min or max
Map<String, Integer> predicates1 = Map.of(
    "min", 200
);

List<Map<String, Object>> hotelInfos1 = gateway.findAll(predicates1);
```
\
In the ```App``` class, implement a public static method ```findTheCheapestService()``` that works with the gateway
so that it takes a price range from the user, accesses the service and selects the best offer from it:
```
Map<String, Integer> predicates = Map.of(
    "min", 200,
    "max", 300
);

Map<String, Object> result = App.findTheCheapestService(predicates);
System.out.println(result); // => {hotel={name=volga, cost=224.0}, service=ostrovok}
```
\
Implement the ```Strategy``` interface and strategy classes



