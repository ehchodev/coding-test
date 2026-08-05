# 1603. Design Parking System

**Design a parking system for a parking lot.**  
주차장을 위한 주차 시스템을 설계하라. 

**The parking lot has three kinds of parking spaces: big, medium, and small, with a fixed number of slots for each size.**  
주차장은 세 종류의 주차 공간이 있다: 대형, 중형, 소형이 있으며, 각 크기에 따른 주차 대수는 고정되어 있다.

**Implement the `ParkingSystem` class:**  
`ParkingSystem` 클래스를 구현하라:

- **`ParkingSystem(int big, int medium, int small)` Initializes object of the `ParkingSystem` class. The number of slots for each parking space are given as part of the constructor.**  
`ParkingSystem(int big, int medium, int small)`은 `ParkingSystem` 클래스의 객체를 초기화한다. 각 주차 공간의 개수는 생성자에 인자로 주어진다.

- **`bool addCar(int carType)` Checks whether there is a parking space of `carType` for the car that wants to get into the parking lot.
`carType` can be of three kinds: big, medium, or small, which are represented by `1`, `2`, and `3` respectively. A car can only park in a parking space of its `carType`. 
If there is no space available, return `false`, else park the car in that size space and return `true`.**  
`bool addCar(int carType)`는 들어오려는 차의 `carType`에 따른 주차 공간을 확인한다. 
`carType`은 세 종류가 될 수 있다: 대형, 중형, 소형이고, 각각 `1`, `2`, `3`으로 표현된다. 자동차는 오직 `carType`에 맞는 공간에만 주차할 수 있다. 
만약 공간이 없는 경우, `false`를 반환하고, 아닌 경우 자동차에 맞는 크기의 공간에 주차 처리하고 `true`를 반환하라.
