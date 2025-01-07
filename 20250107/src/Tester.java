/**
 * Description:
 * Date: 2025-01-08
 * Time: 0:25
 */

import java.util.ArrayList;
import java.util.List;

// Room Class: Subject in Observer Pattern
class Room {
    private double temperature;
    private List<Sensor> sensors = new ArrayList<>();

    public Room(double temperature) {
        this.temperature = temperature;
    }

    public void attach(Sensor sensor) {
        sensors.add(sensor);
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifySensors();
    }

    private void notifySensors() {
        for (Sensor sensor : sensors) {
            sensor.update(temperature);
        }
    }
}

// Sensor Interface: Observer in Observer Pattern
interface Sensor {
    void update(double temperature);
}

// Plain Sensor Class
class PlainSensor implements Sensor {
    private Room room;

    public PlainSensor(Room room) {
        this.room = room;
        room.attach(this);
    }

    @Override
    public void update(double temperature) {
        System.out.println("Displaying: " + temperature + "°C");
    }
}

// Intelligent Sensor Class
class IntelligentSensor implements Sensor {
    private Room room;
    private String type;

    public IntelligentSensor(Room room, String type) {
        this.room = room;
        this.type = type;
        room.attach(this);
    }

    @Override
    public void update(double temperature) {
        if (type.equals("BeepAlarm") && temperature > 40) {
            System.out.println("Beeping: Temperature is " + temperature + "°C");
        } else if (type.equals("SMSAlarm") && temperature > 60) {
            System.out.println("Sending SMS: Temperature is " + temperature + "°C");
        }
    }
}
public class Tester {
    public static void main(String[] args) {
        Room room = new Room(10); // 创建房间，初始温度 10°C
        new PlainSensor(room); // 创建普通传感器
        new IntelligentSensor(room, "SMSAlarm"); // 创建智能传感器（短信警报）
        new IntelligentSensor(room, "BeepAlarm"); // 创建智能传感器（蜂鸣警报）

        room.setTemperature(70); // 设置房间温度为 70°C
    }
}
