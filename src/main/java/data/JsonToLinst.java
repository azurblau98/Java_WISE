//package data;
//import java.time.*;
//import io.github.cdimascio.dotenv.Dotenv;
//import org.json.*;
//import java.io.*;
//import java.util.*;
//
//public class JsonToLinst {
//
//    private static final Dotenv dotenv = Dotenv.load();
//
//    public class DroneTypes {
//        private int control_range;
//        private int max_carriage;
//        private int weight;
//        private int max_speed;
//        private int id;
//        private int battery_capacity;
//        private String typename;
//        private String manufacturer;
//
//        // Constructor
//        public DroneTypes(int control_range, int max_carriage, int weight, int max_speed, int id, int battery_capacity, String typename, String manufacturer) {
//            this.control_range = control_range;
//            this.max_carriage = max_carriage;
//            this.weight = weight;
//            this.max_speed = max_speed;
//            this.id = id;
//            this.battery_capacity = battery_capacity;
//            this.typename = typename;
//            this.manufacturer = manufacturer;
//        }
//    }
//
//    public class DroneData {
//        private String carriage_type;
//        private int carriage_weight;
//        private int id;
//
//        // Constructor
//        public DroneData(String carriage_type, int carriage_weight, int id) {
//            this.carriage_type = carriage_type;
//            this.carriage_weight = carriage_weight;
//            this.id = id;
//        }
//    }
//
//    public class DroneDynamics {
//        private double latitude;
//        private String drone;
//        private int speed;
//        private ZonedDateTime timestamp;
//        private double longitude;
//        private int battery_status;
//        private String status;
//
//        // Constructor
//        public DroneDynamics(double latitude, String drone, int speed, ZonedDateTime timestamp, double longitude, int battery_status, String status) {
//            this.latitude = latitude;
//            this.drone = drone;
//            this.speed = speed;
//            this.timestamp = timestamp;
//            this.longitude = longitude;
//            this.battery_status = battery_status;
//            this.status = status;
//        }
//    }
//
//    public List<DroneData> createDroneDataFromJson() {
//        String filePathDrones = dotenv.get("FILE_PATH_DRONE");
//        List<DroneData> droneDataList = new ArrayList<>();
//        try {
//            JSONArray jsonArray = new JSONArray(new Scanner(new File(filePathDrones)).useDelimiter("\\Z").next());
//            for (int i = 0; i < jsonArray.length(); i++) {
//                JSONObject jsonObject = jsonArray.getJSONObject(i);
//                DroneData droneData = new DroneData(
//                        jsonObject.getString("carriage_type"),
//                        jsonObject.getInt("carriage_weight"),
//                        jsonObject.getInt("id")
//                );
//                droneDataList.add(droneData);
//            }
//        } catch (FileNotFoundException | JSONException e) {
//            e.printStackTrace();
//        }
//        return droneDataList;
//    }
//
//    public List<DroneTypes> createDroneTypesFromJson() {
//        String filePathDroneTypes = dotenv.get("FILE_PATH_DRONETYPE");
//        List<DroneTypes> droneTypesList = new ArrayList<>();
//        try {
//            JSONArray jsonArray = new JSONArray(new Scanner(new File(filePathDroneTypes)).useDelimiter("\\Z").next());
//            for (int i = 0; i < jsonArray.length(); i++) {
//                JSONObject jsonObject = jsonArray.getJSONObject(i);
//                DroneTypes droneTypes = new DroneTypes(
//                        jsonObject.getInt("control_range"),
//                        jsonObject.getInt("max_carriage"),
//                        jsonObject.getInt("weight"),
//                        jsonObject.getInt("max_speed"),
//                        jsonObject.getInt("id"),
//                        jsonObject.getInt("battery_capacity"),
//                        jsonObject.getString("typename"),
//                        jsonObject.getString("manufacturer")
//                );
//                droneTypesList.add(droneTypes);
//            }
//        } catch (FileNotFoundException | JSONException e) {
//            e.printStackTrace();
//        }
//        return droneTypesList;
//    }
//
//
//    public List<DroneDynamics> createDroneDynamicsFromJson() {
//        String filePathDroneDynamics = dotenv.get("FILE_PATH_DRONEDYNAMICS");
//        List<DroneDynamics> droneDynamicsList = new ArrayList<>();
//        try {
//            JSONArray jsonArray = new JSONArray(new Scanner(new File(filePathDroneDynamics)).useDelimiter("\\Z").next());
//            for (int i = 0; i < jsonArray.length(); i++) {
//                JSONObject jsonObject = jsonArray.getJSONObject(i);
//                DroneDynamics droneDynamics = new DroneDynamics(
//                        jsonObject.getDouble("latitude"),
//                        jsonObject.getString("drone"),
//                        jsonObject.getInt("speed"),
//                        // Assuming the timestamp is in ISO 8601 format
//                        ZonedDateTime.parse(jsonObject.getString("timestamp")),
//                        jsonObject.getDouble("longitude"),
//                        jsonObject.getInt("battery_status"),
//                        jsonObject.getString("status")
//                );
//                droneDynamicsList.add(droneDynamics);
//            }
//        } catch (FileNotFoundException | JSONException e) {
//            e.printStackTrace();
//        }
//        return droneDynamicsList;
//    }
//
//    public List<DroneData> createDroneDataFromJson(String filePath) {
//        List<DroneData> droneDataList = new ArrayList<>();
//        try {
//            JSONArray jsonArray = new JSONArray(new Scanner(new File(filePath)).useDelimiter("\\Z").next());
//            for (int i = 0; i < jsonArray.length(); i++) {
//                JSONObject jsonObject = jsonArray.getJSONObject(i);
//                DroneData droneData = new DroneData(
//                        jsonObject.getString("carriage_type"),
//                        jsonObject.getInt("carriage_weight"),
//                        jsonObject.getInt("id")
//                );
//                droneDataList.add(droneData);
//            }
//        } catch (FileNotFoundException | JSONException e) {
//            e.printStackTrace();
//        }
//        return droneDataList;
//    }
//
//    public List<DroneTypes> createDroneTypesFromJson(String filePath) {
//        List<DroneTypes> droneTypesList = new ArrayList<>();
//        try {
//            JSONArray jsonArray = new JSONArray(new Scanner(new File(filePath)).useDelimiter("\\Z").next());
//            for (int i = 0; i < jsonArray.length(); i++) {
//                JSONObject jsonObject = jsonArray.getJSONObject(i);
//                DroneTypes droneTypes = new DroneTypes(
//                        jsonObject.getInt("control_range"),
//                        jsonObject.getInt("max_carriage"),
//                        jsonObject.getInt("weight"),
//                        jsonObject.getInt("max_speed"),
//                        jsonObject.getInt("id"),
//                        jsonObject.getInt("battery_capacity"),
//                        jsonObject.getString("typename"),
//                        jsonObject.getString("manufacturer")
//                );
//                droneTypesList.add(droneTypes);
//            }
//        } catch (FileNotFoundException | JSONException e) {
//            e.printStackTrace();
//        }
//        return droneTypesList;
//    }
//
//    public List<DroneDynamics> createDroneDynamicsFromJson(String filePath) {
//        List<DroneDynamics> droneDynamicsList = new ArrayList<>();
//        try {
//            JSONArray jsonArray = new JSONArray(new Scanner(new File(filePath)).useDelimiter("\\Z").next());
//            for (int i = 0; i < jsonArray.length(); i++) {
//                JSONObject jsonObject = jsonArray.getJSONObject(i);
//                DroneDynamics droneDynamics = new DroneDynamics(
//                        jsonObject.getDouble("latitude"),
//                        jsonObject.getString("drone"),
//                        jsonObject.getInt("speed"),
//                        // Assuming the timestamp is in ISO 8601 format
//                        ZonedDateTime.parse(jsonObject.getString("timestamp")),
//                        jsonObject.getDouble("longitude"),
//                        jsonObject.getInt("battery_status"),
//                        jsonObject.getString("status")
//                );
//                droneDynamicsList.add(droneDynamics);
//            }
//        } catch (FileNotFoundException | JSONException e) {
//            e.printStackTrace();
//        }
//        return droneDynamicsList;
//    }
//
////    public void saveListToFile(List<?> list, String filePath) throws IOException {
////        Path path = Paths.get(filePath);
////        try {
////            String content = list.stream().map(Object::toString).collect(Collectors.joining("\n"));
////            Files.writeString(path, content);
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////    }
//
//    public void saveListToFile(List<?> list, String filePath) throws IOException {
//        try (PrintWriter pw = new PrintWriter(new FileOutputStream(filePath))) {
//            list.stream()
//                    .map(Object::toString)
//                    .forEach(pw::println);
//        }
//    }
//
//
//    public void saveDroneTypesListToFile(String filePathDroneTypes) {
//        List<DroneTypes> droneTypesList = createDroneTypesFromJson(filePathDroneTypes);
//        String csvFilePath = dotenv.get("CSV_PATH_DRONETYPE");
//        try {
//            saveListToFile(droneTypesList, csvFilePath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void saveDroneDataListToFile(String filePathDrones) {
//        List<DroneData> droneDataList = createDroneDataFromJson(filePathDrones);
//        String csvFilePath = dotenv.get("CSV_PATH_DRONE");
//        try {
//            saveListToFile(droneDataList, csvFilePath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void saveDroneDynamicsListToFile(String filePathDroneDynamics) {
//        List<DroneDynamics> droneDynamicsList = createDroneDynamicsFromJson(filePathDroneDynamics);
//        String csvFilePath = dotenv.get("CSV_PATH_DRONEDYNAMICS");
//        try {
//            saveListToFile(droneDynamicsList, csvFilePath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        JsonToLinst jtl = new JsonToLinst();
//
//        String filePathDroneTypes = dotenv.get("JSON_PATH_DRONETYPE");
//        jtl.saveDroneTypesListToFile(filePathDroneTypes);
//
//        String filePathDrones = dotenv.get("JSON_PATH_DRONE");
//        jtl.saveDroneDataListToFile(filePathDrones);
//
//        String filePathDroneDynamics = dotenv.get("JSON_PATH_DRONEDYNAMICS");
//        jtl.saveDroneDynamicsListToFile(filePathDroneDynamics);
//    }
//
//}
