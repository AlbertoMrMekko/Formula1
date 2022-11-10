public class Main {
    public static void main(String[] args) throws Exception {
        // creación de instancias y su unión.
        Vehiculo car1 = new Coche("1357BNM", 7, "azul", "GTX1212");
        Vehiculo car2 = new Coche("5454HJK", 2, "azul", "GTX1212");
        Vehiculo car3 = new Coche("3273KSL", 4, "amarillo", "GTX1213");
        Vehiculo car4 = new Coche("1929HGD", 78, "amarillo", "GTX1213");
        Vehiculo car5 = new Coche("6783GZT", 73, "rojo", "GTX112");
        Vehiculo car6 = new Coche("2222QQW", 1, "rojo", "GTX112");
        Vehiculo car7 = new Coche("7654CRF", 56, "verde", "GTX1245");
        Vehiculo car8 = new Coche("1634HJM", 9, "verde", "GTX1245");
        Vehiculo car9 = new Coche("9876HDF", 10, "morado", "GTX1234");
        Vehiculo car10 = new Coche("6567TFT", 8, "morado", "GTX1234");
        Vehiculo car11 = new Coche("6432FFD", 45, "naranja", "GTX1223");
        Vehiculo car12 = new Coche("1155PWY", 22, "naranja", "GTX1223");
        Vehiculo car13 = new Coche("2627BDB", 11, "marrón", "GTX1225");
        Vehiculo car14 = new Coche("2387JNN", 13, "marrón", "GTX1225");
        Vehiculo car15 = new Coche("4529HHH", 18, "rosa", "GTX1356");
        Vehiculo car16 = new Coche("1944QLK", 16, "rosa", "GTX1356");
        Vehiculo car17 = new Coche("7322RRT", 33, "blanco", "GTX1345");
        Vehiculo car18 = new Coche("9753GHR", 31, "blanco", "GTX1345");
        Vehiculo car19 = new Coche("9837DDD", 39, "negro", "GTX1455");
        Vehiculo car20 = new Coche("5335FRT", 47, "negro", "GTX1455");

        Vehiculo moto1 = new Moto("5432BBC", 93, "naranja", "curvado");
        Vehiculo moto2 = new Moto("9989BBB", 88, "naranja", "cuadrado");
        Vehiculo moto3 = new Moto("2233RTW", 3, "negro", "curvado");
        Vehiculo moto4 = new Moto("5567WDF", 5, "negro", "cuadrado");
        Vehiculo moto5 = new Moto("3563SSD", 8, "verde", "curvado");
        Vehiculo moto6 = new Moto("8668HGH", 6, "verde", "cuadrado");
        Vehiculo moto7 = new Moto("6723QKJ", 29, "rojo", "curvado");
        Vehiculo moto8 = new Moto("6643GHH", 27, "rojo", "cuadrado");
        Vehiculo moto9 = new Moto("1572LLK", 36, "blanco", "curvado");
        Vehiculo moto10 = new Moto("9658VCZ", 69, "blanco", "cuadrado");

        Piloto p1 = new Piloto("Alonso", 39, "España", car1);
        Piloto p2 = new Piloto("Ricciardo", 23, "Italia", car2);
        Piloto p3 = new Piloto("GrosJean", 24, "Francia", car3);
        Piloto p4 = new Piloto("Räikkönen", 25, "Finlandia", car4);
        Piloto p5 = new Piloto("Vettel", 28, "Alemania", car5);
        Piloto p6 = new Piloto("Leclerc", 39, "Mónaco", car6);
        Piloto p7 = new Piloto("Bottas", 19, "Finlandia", car7);
        Piloto p8 = new Piloto("Hamilton", 22, "UK", car8);
        Piloto p9 = new Piloto("Verstappen", 21, "Países Bajos", car9);
        Piloto p10 = new Piloto("Giovinacci", 22, "Italia", car10);
        Piloto p11 = new Piloto("Magnussen", 26, "Dinamarca", car11);
        Piloto p12 = new Piloto("Kvyat", 28, "Rusia", car12);
        Piloto p13 = new Piloto("Ocon", 30, "Francia", car13);
        Piloto p14 = new Piloto("Gasly", 34, "Francia", car14);
        Piloto p15 = new Piloto("Stroll", 35, "Canadá", car15);
        Piloto p16 = new Piloto("Pérez", 30, "España", car16);
        Piloto p17 = new Piloto("Sáinz", 31, "España", car17);
        Piloto p18 = new Piloto("Norris", 25, "UK", car18);
        Piloto p19 = new Piloto("Latifi", 29, "Canadá", car19);
        Piloto p20 = new Piloto("Rusell", 27, "UK", car20);

        Piloto p21 = new Piloto("Marc Márquez", 27, "España", moto1);
        Piloto p22 = new Piloto("Alex Márquez", 27, "España", moto2);
        Piloto p23 = new Piloto("Petrucci", 27, "Italia", moto3);
        Piloto p24 = new Piloto("Bagnaia", 27, "Italia", moto4);
        Piloto p25 = new Piloto("Lorenzo", 27, "España", moto5);
        Piloto p26 = new Piloto("Rosi", 27, "Italia", moto6);
        Piloto p27 = new Piloto("Espargaro", 27, "España", moto7);
        Piloto p28 = new Piloto("Miller", 27, "Australia", moto8);
        Piloto p29 = new Piloto("Rins", 27, "España", moto9);
        Piloto p30 = new Piloto("Nakagami", 27, "Japón", moto10);

        Piloto[] drivers = new Piloto[30];
        drivers[0] = p1;
        drivers[1] = p2;
        drivers[2] = p3;
        drivers[3] = p4;
        drivers[4] = p5;
        drivers[5] = p6;
        drivers[6] = p7;
        drivers[7] = p8;
        drivers[8] = p9;
        drivers[9] = p10;
        drivers[10] = p11;
        drivers[11] = p12;
        drivers[12] = p13;
        drivers[13] = p14;
        drivers[14] = p15;
        drivers[15] = p16;
        drivers[16] = p17;
        drivers[17] = p18;
        drivers[18] = p19;
        drivers[19] = p20;
        drivers[20] = p21;
        drivers[21] = p22;
        drivers[22] = p23;
        drivers[23] = p24;
        drivers[24] = p25;
        drivers[25] = p26;
        drivers[26] = p27;
        drivers[27] = p28;
        drivers[28] = p29;
        drivers[29] = p30;

        Escuderia esc1 = new Escuderia("Renault", "Francia");
        Escuderia esc2 = new Escuderia("Alfa Romeo", "Italia");
        Escuderia esc3 = new Escuderia("Ferrari", "Italia");
        Escuderia esc4 = new Escuderia("Mercedes", "Alemania");
        Escuderia esc5 = new Escuderia("Red Bull", "Austria");
        Escuderia esc6 = new Escuderia("Force India", "India");
        Escuderia esc7 = new Escuderia("AlphaTauri", "Italia");
        Escuderia esc8 = new Escuderia("Haas", "EEUU");
        Escuderia esc9 = new Escuderia("McLaren", "UK");
        Escuderia esc10 = new Escuderia("Williams", "UK");
        Escuderia esc11 = new Escuderia("Repsol", "Japón");
        Escuderia esc12 = new Escuderia("Ducati", "Italia");
        Escuderia esc13 = new Escuderia("Yamaha", "Japón");
        Escuderia esc14 = new Escuderia("Aprilia", "Italia");
        Escuderia esc15 = new Escuderia("Avintia", "España");

        Escuderia[] teams = new Escuderia[15];
        teams[0] = esc1;
        teams[1] = esc2;
        teams[2] = esc3;
        teams[3] = esc4;
        teams[4] = esc5;
        teams[5] = esc6;
        teams[6] = esc7;
        teams[7] = esc8;
        teams[8] = esc9;
        teams[9] = esc10;
        teams[10] = esc11;
        teams[11] = esc12;
        teams[12] = esc13;
        teams[13] = esc14;
        teams[14] = esc15;

        esc1.insertarPiloto(p1);
        esc1.insertarPiloto(p2);
        esc2.insertarPiloto(p3);
        esc2.insertarPiloto(p4);
        esc3.insertarPiloto(p5);
        esc3.insertarPiloto(p6);
        esc4.insertarPiloto(p7);
        esc4.insertarPiloto(p8);
        esc5.insertarPiloto(p9);
        esc5.insertarPiloto(p10);
        esc6.insertarPiloto(p11);
        esc6.insertarPiloto(p12);
        esc7.insertarPiloto(p13);
        esc7.insertarPiloto(p14);
        esc8.insertarPiloto(p15);
        esc8.insertarPiloto(p16);
        esc9.insertarPiloto(p17);
        esc9.insertarPiloto(p18);
        esc10.insertarPiloto(p19);
        esc10.insertarPiloto(p20);
        esc11.insertarPiloto(p21);
        esc11.insertarPiloto(p22);
        esc12.insertarPiloto(p23);
        esc12.insertarPiloto(p24);
        esc13.insertarPiloto(p25);
        esc13.insertarPiloto(p26);
        esc14.insertarPiloto(p27);
        esc14.insertarPiloto(p28);
        esc15.insertarPiloto(p29);
        esc15.insertarPiloto(p30);

        p1.setEscuderia(esc1);
        p2.setEscuderia(esc1);
        p3.setEscuderia(esc2);
        p4.setEscuderia(esc2);
        p5.setEscuderia(esc3);
        p6.setEscuderia(esc3);
        p7.setEscuderia(esc4);
        p8.setEscuderia(esc4);
        p9.setEscuderia(esc5);
        p10.setEscuderia(esc5);
        p11.setEscuderia(esc6);
        p12.setEscuderia(esc6);
        p13.setEscuderia(esc7);
        p14.setEscuderia(esc7);
        p15.setEscuderia(esc8);
        p16.setEscuderia(esc8);
        p17.setEscuderia(esc9);
        p18.setEscuderia(esc9);
        p19.setEscuderia(esc10);
        p20.setEscuderia(esc10);
        p21.setEscuderia(esc11);
        p22.setEscuderia(esc11);
        p23.setEscuderia(esc12);
        p24.setEscuderia(esc12);
        p25.setEscuderia(esc13);
        p26.setEscuderia(esc13);
        p27.setEscuderia(esc14);
        p28.setEscuderia(esc14);
        p29.setEscuderia(esc15);
        p30.setEscuderia(esc15);

        Carrera race1 = new Carrera("GP de Francia", "Paris", 2020, 42);
        Carrera race2 = new Carrera("GP de Dinamarca", "Copenhague", 2020, 39);
        Carrera race3 = new Carrera("GP de España", "Madrid", 2020, 43);
        Carrera race4 = new Carrera("GP de Italia", "Roma", 2020, 40);
        Carrera race5 = new Carrera("GP de Japón", "Tokio", 2020, 51);
        Carrera race6 = new Carrera("GP de Emiratos Árabes", "Abu Dhabi", 2020, 45);
        Carrera race7 = new Carrera("GP de Alemania", "Berlín", 2020, 45);
        Carrera race8 = new Carrera("GP de Reino Unido", "Londres", 2020, 35);
        Carrera race9 = new Carrera("GP de Hungría", "Budapest", 2020, 44);
        Carrera race10 = new Carrera("GP de Chequia", "Praga", 2020, 52);

        Competicion comp1 = new Competicion("World Championship 2020");
        comp1.aniadirCarrera(race1);
        comp1.aniadirCarrera(race2);
        comp1.aniadirCarrera(race3);
        comp1.aniadirCarrera(race4);
        comp1.aniadirCarrera(race5);
        comp1.aniadirCarrera(race6);
        comp1.aniadirCarrera(race7);
        comp1.aniadirCarrera(race8);
        comp1.aniadirCarrera(race9);
        comp1.aniadirCarrera(race10);
        // fin creación de instancias y su unión.

        // inserción de resultados de cada carrera
        race1.resultadosCarrera(drivers);
        race2.resultadosCarrera(drivers);
        race3.resultadosCarrera(drivers);
        race4.resultadosCarrera(drivers);
        race5.resultadosCarrera(drivers);
        race6.resultadosCarrera(drivers);
        race7.resultadosCarrera(drivers);
        race8.resultadosCarrera(drivers);
        race9.resultadosCarrera(drivers);
        race10.resultadosCarrera(drivers);

        // visualización de resultados
        comp1.mostrarCompeticion(drivers, teams);

        // todos los métodos del programa funcionan correctamente.
        // el programa está hecho para 1 sóla competición, los puntos no se resetean.
    }
}
