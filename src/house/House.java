package house;

import house.rooms.*;

public class House {

    public static final int MAX_REST_ROOMS=10;
    public static final int MAX_BED_ROOMS=10;
    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private LivingRoom livingRoom;
    private RestRoom[] restRooms = new RestRoom[MAX_REST_ROOMS];

    private BedRoom[] bedRooms = new BedRoom[MAX_BED_ROOMS];
    private Yard yard;


    public void addRooms(BedRoom bedRoom){
        int indexBedRooms;
        for(indexBedRooms=0; indexBedRooms<bedRooms.length; indexBedRooms++){
            bedRooms[indexBedRooms]=bedRoom;
        }
    }
    public void addRooms(RestRoom restRoom){
        int indexRestRooms;
        for(indexRestRooms=0; indexRestRooms<bedRooms.length; indexRestRooms++){
            restRooms[indexRestRooms]=restRoom;
        }
    }
    private Kitchen getKitchen(){
        return kitchen;
    }
    private void setKitchen(Kitchen kitchen){
        this.kitchen=kitchen;
    }
    private DiningRoom getDiningRoom(){
        return diningRoom;
    }
    private void setDiningRoom(DiningRoom diningRoom){
        this.diningRoom=diningRoom;
    }
    private LivingRoom getLivingRoom(){
        return livingRoom;
    }
    private void setLivingRoom(LivingRoom livingRoom){
        this.livingRoom=livingRoom;
    }
    private RestRoom[] getRestRooms(){
        return restRooms;
    }
    private void setRestRooms(RestRoom[] restRooms){
        this.restRooms=restRooms;
    }
    private BedRoom[] getBedRooms(){
        return bedRooms;
    }
    private void setBedRooms(BedRoom[] bedRooms){
        this.bedRooms=bedRooms;
    }

    private Yard getYard(){
        return yard;
    }
    private void setYard(Yard yard){
        this.yard=yard;
    }
}
