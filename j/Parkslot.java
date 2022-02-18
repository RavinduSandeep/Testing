public class Parkslot {
    String slotid;
    String facultyid;
    String slotgps;
    String nearbuilding;
    String lenthwidth;
    boolean savailable;

    public static void main(String[] args){

        //Technology faculty handicapped slots
        Parkslot fothandi1 = new Parkslot();
        fothandi1.slotid = "F001H01";
        fothandi1.facultyid = "F001";
        fothandi1.slotgps = "000";
        fothandi1.nearbuilding = "Administration Building";
        fothandi1.savailable = true;

        Parkslot fothandi2 = new Parkslot();
        fothandi2.slotid = "F001H02";
        fothandi2.facultyid = "F001";
        fothandi2.slotgps = "000";
        fothandi2.nearbuilding = "Administration Building";
        fothandi2.savailable = true;


        //Science faculty handicapped parking slots
        Parkslot scihandi1 = new Parkslot();
        scihandi1.slotid = "F002H01";
        scihandi1.facultyid = "F002";
        scihandi1.slotgps = "000";
        scihandi1.nearbuilding = "Administration Building";
        scihandi1.savailable = true;

        Parkslot scihandi2 = new Parkslot();
        scihandi2.slotid = "F002H02";
        scihandi2.facultyid = "F002";
        scihandi2.slotgps = "000";
        scihandi2.nearbuilding = "Administration Building";
        scihandi2.savailable = true;


        //Management faculty handicapped parking slots
        Parkslot manhandi1 = new Parkslot();
        manhandi1.slotid = "F003H01";
        manhandi1.facultyid = "F003";
        manhandi1.slotgps = "000";
        manhandi1.nearbuilding = "Administration Building";
        manhandi1.savailable = true;

        Parkslot manhandi2 = new Parkslot();
        manhandi2.slotid = "F003H02";
        manhandi2.facultyid = "F003";
        manhandi2.slotgps = "000";
        manhandi2.nearbuilding = "Administration Building";
        manhandi2.savailable = true;


        //Medical faculty handicapped parking slots
        Parkslot medhandi1 = new Parkslot();
        medhandi1.slotid = "F004H01";
        medhandi1.facultyid = "F004";
        medhandi1.slotgps = "000";
        medhandi1.nearbuilding = "Administration Building";
        medhandi1.savailable = true;

        Parkslot medhandi2 = new Parkslot();
        medhandi2.slotid = "F004H02";
        medhandi2.facultyid = "F004";
        medhandi2.slotgps = "000";
        medhandi2.nearbuilding = "Administration Building";
        medhandi2.savailable = true;


        //Art faculty handicapped parking slots
        Parkslot arthandi1 = new Parkslot();
        arthandi1.slotid = "F005H01";
        arthandi1.facultyid = "F005";
        arthandi1.slotgps = "000";
        arthandi1.nearbuilding = "Administration Building";
        arthandi1.savailable = true;

        Parkslot arthandi2 = new Parkslot();
        arthandi2.slotid = "F005H02";
        arthandi2.facultyid = "F005";
        arthandi2.slotgps = "000";
        arthandi2.nearbuilding = "Administration Building";
        arthandi2.savailable = true;



        //Technology faculty long slots
        Parkslot fotlong1 = new Parkslot();
        fotlong1.slotid = "F001L01";
        fotlong1.facultyid = "F001";
        fotlong1.slotgps = "000";
        fotlong1.lenthwidth = "15*8";
        fotlong1.savailable = true;

        Parkslot fotlong2 = new Parkslot();
        fotlong2.slotid = "F001L02";
        fotlong2.facultyid = "F001";
        fotlong2.slotgps = "000";
        fotlong2.lenthwidth = "15*8";
        fotlong2.savailable = true;

        Parkslot fotlong3 = new Parkslot();
        fotlong3.slotid = "F001L03";
        fotlong3.facultyid = "F001";
        fotlong3.slotgps = "000";
        fotlong3.lenthwidth = "15*8";
        fotlong3.savailable = true;


        //Science faculty long parking slots
        Parkslot scilong1 = new Parkslot();
        scilong1.slotid = "F002L01";
        scilong1.facultyid = "F002";
        scilong1.slotgps = "000";
        scilong1.lenthwidth = "15*8";
        scilong1.savailable = true;

        Parkslot scilong2 = new Parkslot();
        scilong2.slotid = "F002L02";
        scilong2.facultyid = "F002";
        scilong2.slotgps = "000";
        scilong2.lenthwidth = "15*8";
        scilong2.savailable = true;

        Parkslot scilong3 = new Parkslot();
        scilong3.slotid = "F002L03";
        scilong3.facultyid = "F002";
        scilong3.slotgps = "000";
        scilong3.lenthwidth = "15*8";
        scilong3.savailable = true;


        //Management faculty long parking slots
        Parkslot manlong1 = new Parkslot();
        manlong1.slotid = "F003F01";
        manlong1.facultyid = "F003";
        manlong1.slotgps = "000";
        manlong1.lenthwidth = "15*8";
        manlong1.savailable = true;

        Parkslot manlong2 = new Parkslot();
        manlong2.slotid = "F003L02";
        manlong2.facultyid = "F003";
        manlong2.slotgps = "000";
        manlong2.lenthwidth = "15*8";
        manlong2.savailable = true;

        Parkslot manlong3 = new Parkslot();
        manlong3.slotid = "F00LS03";
        manlong3.facultyid = "F003";
        manlong3.slotgps = "000";
        manlong3.lenthwidth = "15*8";
        manlong3.savailable = true;


        //Medical faculty long parking slots
        Parkslot medlong1 = new Parkslot();
        medlong1.slotid = "F004L01";
        medlong1.facultyid = "F004";
        medlong1.slotgps = "000";
        medlong1.lenthwidth = "15*8";
        medlong1.savailable = true;

        Parkslot medlong2 = new Parkslot();
        medlong2.slotid = "F004L02";
        medlong2.facultyid = "F004";
        medlong2.slotgps = "000";
        medlong2.lenthwidth = "15*8";
        medlong2.savailable = true;

        Parkslot medlong3 = new Parkslot();
        medlong3.slotid = "F004L03";
        medlong3.facultyid = "F004";
        medlong3.slotgps = "000";
        medlong3.lenthwidth = "15*8";
        medlong3.savailable = true;


        //Art faculty long parking slots
        Parkslot artlong1 = new Parkslot();
        artlong1.slotid = "F005L01";
        artlong1.facultyid = "F005";
        artlong1.slotgps = "000";
        artlong1.lenthwidth = "15*8";
        artlong1.savailable = true;

        Parkslot artlong2 = new Parkslot();
        artlong2.slotid = "F005L02";
        artlong2.facultyid = "F005";
        artlong2.slotgps = "000";
        artlong2.lenthwidth = "15*8";
        artlong2.savailable = true;

        Parkslot artlong3 = new Parkslot();
        artlong3.slotid = "F005L03";
        artlong3.facultyid = "F005";
        artlong3.slotgps = "000";
        artlong3.lenthwidth = "15*8";
        artlong3.savailable = true;



        //Technology faculty standard parking slots
        Parkslot fotstandard1 = new Parkslot();
        fotstandard1.slotid = "F001S01";
        fotstandard1.facultyid = "F001";
        fotstandard1.slotgps = "000";
        fotstandard1.savailable = true;

        Parkslot fotstandard2 = new Parkslot();
        fotstandard2.slotid = "F001S02";
        fotstandard2.facultyid = "F001";
        fotstandard2.slotgps = "000";
        fotstandard2.savailable = true;

        Parkslot fotstandard3 = new Parkslot();
        fotstandard3.slotid = "F001S03";
        fotstandard3.facultyid = "F001";
        fotstandard3.slotgps = "000";
        fotstandard3.savailable = true;

        Parkslot fotstandard4 = new Parkslot();
        fotstandard4.slotid = "F001S04";
        fotstandard4.facultyid = "F001";
        fotstandard4.slotgps = "000";
        fotstandard4.savailable = true;

        Parkslot fotstandard5 = new Parkslot();
        fotstandard5.slotid = "F001S05";
        fotstandard5.facultyid = "F001";
        fotstandard5.slotgps = "000";
        fotstandard5.savailable = true;


        //Science faculty standard parking slots
        Parkslot scistandard1 = new Parkslot();
        scistandard1.slotid = "F002S01";
        scistandard1.facultyid = "F002";
        scistandard1.slotgps = "000";
        scistandard1.savailable = true;

        Parkslot scistandard2 = new Parkslot();
        scistandard2.slotid = "F002S02";
        scistandard2.facultyid = "F002";
        scistandard2.slotgps = "000";
        scistandard2.savailable = true;

        Parkslot scistandard3 = new Parkslot();
        scistandard3.slotid = "F002S03";
        scistandard3.facultyid = "F002";
        scistandard3.slotgps = "000";
        scistandard3.savailable = true;

        Parkslot scistandard4 = new Parkslot();
        scistandard4.slotid = "F002S04";
        scistandard4.facultyid = "F002";
        scistandard4.slotgps = "000";
        scistandard4.savailable = true;

        Parkslot scistandard5 = new Parkslot();
        scistandard5.slotid = "F002S05";
        scistandard5.facultyid = "F002";
        scistandard5.slotgps = "000";
        scistandard5.savailable = true;


        //Management faculty standard parking slots
        Parkslot manstandard1 = new Parkslot();
        manstandard1.slotid = "F003S01";
        manstandard1.facultyid = "F003";
        manstandard1.slotgps = "000";
        manstandard1.savailable = true;

        Parkslot manstandard2 = new Parkslot();
        manstandard2.slotid = "F003S02";
        manstandard2.facultyid = "F003";
        manstandard2.slotgps = "000";
        manstandard2.savailable = true;

        Parkslot manstandard3 = new Parkslot();
        manstandard3.slotid = "F003S03";
        manstandard3.facultyid = "F003";
        manstandard3.slotgps = "000";
        manstandard3.savailable = true;

        Parkslot manstandard4 = new Parkslot();
        manstandard4.slotid = "F003S04";
        manstandard4.facultyid = "F003";
        manstandard4.slotgps = "000";
        manstandard4.savailable = true;

        Parkslot manstandard5 = new Parkslot();
        manstandard5.slotid = "F003S05";
        manstandard5.facultyid = "F003";
        manstandard5.slotgps = "000";
        manstandard5.savailable = true;


        //Medical faculty standard parking slots
        Parkslot medstandard1 = new Parkslot();
        medstandard1.slotid = "F004S01";
        medstandard1.facultyid = "F004";
        medstandard1.slotgps = "000";
        medstandard1.savailable = true;

        Parkslot medstandard2 = new Parkslot();
        medstandard2.slotid = "F004S02";
        medstandard2.facultyid = "F004";
        medstandard2.slotgps = "000";
        medstandard2.savailable = true;

        Parkslot medstandard3 = new Parkslot();
        medstandard3.slotid = "F004S03";
        medstandard3.facultyid = "F004";
        medstandard3.slotgps = "000";
        medstandard3.savailable = true;

        Parkslot medstandard4 = new Parkslot();
        medstandard4.slotid = "F004S04";
        medstandard4.facultyid = "F004";
        medstandard4.slotgps = "000";
        medstandard4.savailable = true;

        Parkslot medstandard5 = new Parkslot();
        medstandard5.slotid = "F004S05";
        medstandard5.facultyid = "F004";
        medstandard5.slotgps = "000";
        medstandard5.savailable = true;


        //Art faculty standard parking slots
        Parkslot artstandard1 = new Parkslot();
        artstandard1.slotid = "F005S01";
        artstandard1.facultyid = "F005";
        artstandard1.slotgps = "000";
        artstandard1.savailable = true;

        Parkslot artstandard2 = new Parkslot();
        artstandard2.slotid = "F005S02";
        artstandard2.facultyid = "F005";
        artstandard2.slotgps = "000";
        artstandard2.savailable = true;

        Parkslot artstandard3 = new Parkslot();
        artstandard3.slotid = "F005S03";
        artstandard3.facultyid = "F005";
        artstandard3.slotgps = "000";
        artstandard3.savailable = true;

        Parkslot artstandard4 = new Parkslot();
        artstandard4.slotid = "F005S04";
        artstandard4.facultyid = "F005";
        artstandard4.slotgps = "000";
        artstandard4.savailable = true;

        Parkslot artstandard5 = new Parkslot();
        artstandard5.slotid = "F005S05";
        artstandard5.facultyid = "F005";
        artstandard5.slotgps = "000";
        artstandard5.savailable = true;

    }
}
