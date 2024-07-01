INDIVIDUALUS DARBAS:Užduotis: Restorano rezervacijų valdymo sistema
Jums reikia sukurti API, kuri valdys restorano rezervacijų sistemą. Projektas turi būti realizuotas naudojant Java, Spring Boot karkasą ir duomenų bazę. Jūsų API turėtų leisti atlikti šias operacijas:Pridėti naują klientąPridėti naują rezervacijąGauti visų rezervacijų sąrašąGauti visų rezervacijų sąrašą pagal nurodytą datąGauti visas patvirtintas rezervacijasGauti visas atšauktas rezervacijasIeškoti rezervacijų pagal kliento IDAtšaukti rezervaciją pagal rezervacijos ID
Reikalavimai:Duomenų bazė:
Lentelės: clients ir reservations.
Klientų lentelė (clients):
id: unikalus identifikatorius (ilgasis sveikasis skaičius)
name: kliento vardas (tekstinis laukas)
email: kliento el. paštas (tekstinis laukas)
phone: kliento telefono numeris (tekstinis laukas)
Rezervacijų lentelė (reservations):
id: unikalus identifikatorius (ilgasis sveikasis skaičius)
client_id: kliento ID (ilgasis sveikasis skaičius, svetimosios raktas į clients lentelę)
reservation_date: rezervacijos data ir laikas (laiko žymė)
number_of_people: žmonių skaičius (sveikasis skaičius)
status: rezervacijos būklė (tekstinis laukas, pvz., "patvirtinta", "atšaukta")
Servisai ir kontroleriai:
ClientService: Servisas, atsakingas už klientų valdymą.
ReservationService: Servisas, atsakingas už rezervacijų valdymą.
ClientController: Kontroleris, apdorojantis užklausas, susijusias su klientais.
ReservationController: Kontroleris, apdorojantis užklausas, susijusias su rezervacijomis.
Repository:
ClientRepository:  Klientų duomenų tvarkymui.
ReservationRepository: Rezervacijų duomenų tvarkymui.
Modeliai:
Client: Kliento duomenų modelis.
Reservation: Rezervacijos duomenų modelis.
API Endpoint'ai:POST /clients - Pridėti naują klientą.GET /clients - Gauti visų klientų sąrašą.POST /reservations - Pridėti naują rezervaciją.GET /reservations - Gauti visų rezervacijų sąrašą.GET /reservations/client/{clientId} - Gauti visas rezervacijas pagal kliento ID.GET /reservations?date={date} - Gauti visas rezervacijas pagal datą.GET /reservations/confirmed / GET /reservations/canceled - Gauti visas patvirtintas arba atšauktas rezervacijas.DELETE /reservations/{reservationId} - Atšaukti rezervaciją pagal rezervacijos ID.
