import java.util.Scanner;

public class Main {
    //�� �� ������ ���������� ��������, ����������� ������������� �������, ���������� �����. ���������� �� �������� ������� �������� �����, ���������� ������ ������������ ����� �� �������� ��������:
    //
    //������ �� ��������� �������� � ������. �� ����� ������� �� ��������� � ������� �������� ����������:
    //��� (�������� - �������� ��� � ���������� �������)
    //���� �� �������
    //���� �� ���������� � ������
    //��� �� ������������
    //����� ������� (���������, �����)
    //������� ����������
    //�������������� (������/����/�����) (����������� ������ �� ����� ���������, �� �� �� � ������, ������ �������, �� � �������� ��� � ������ � �������� ���������� ����� � �������� �� ����� �������� �� ���� �����)
    //�������� ���� �� �������� �� ����
    //�������� (�������� �����)
    //��������� �� ���� ��������
    //��� ��� ������� � � �������� ���� �� ������� �� ���� ����������� ���������� �������, ��� �� ���� �������� �� �������� �����
    //��� ����� ���������� �����, ������� �������� � ���� � ���� ���� �� ������� �� ����� ��������� �� ���� � ���� �����
    //��� ��������� �� ������� � ������� �������� �� �� ������ ������ ���������� �� ������������ �������� ���������� �� ����� �� �� �������
    //������� �� ����������� � ����� ������ (�� ������ ������� � ������ ���� �� ������� ������ � ������ ������� �� ����������� � ������� ������, ����������� ���������� � ���������� �� �����)
    //������:
    //Please choose what to do (1 - List all items; 2 - Add new delivery; 3 - List deliveries for time period)
    //<< 1
    //Light bulb - LED 75W | Expiry date: n/a | Entry date: 05.05.2021 | Manufacturer: Philips | Unit: Item | Stock: 104 | Position: A3 / 4 / 10 | Available items at shelf: 500 | Comment:
    //Battery AAA | Expiry date: 10.10.2026 | Entry date: 10.07.2020 | Manufacturer: Duracel | Unit: Item | Stock: 638 | Position: C2 / 5 / 1 | Available items at shelf: 10000 | Comment:in every box there are 10 packages of 4 batters each
    //
    //Please choose what to do (1 - List all items; 2 - Add new delivery; 3 - List deliveries for time period)
    //<< 2
    //Enter product name:
    //<< Battery CR32
    //Enter expiry date:
    //<<24.11.2025
    //Enter entry date:
    //<< 02.06.2021
    //Enter manufacturer:
    //<< Varta
    //Enter unit:
    //<< Item
    //Enter available stock:
    //<< 900
    //Enter comment (optional):
    //<<
    //Product was added successfully!
    //
    //Please choose what to do (1 - List all items; 2 - Add new delivery; 3 - List deliveries for time period)
    //<< 3
    //From date:
    //<< 01.05.2021
    //To date:
    //<< 31.05.2021
    //List of product transactions for the period 01.05.2021 - 31.05.2021:
    //Light bulb - LED 75W | Entry date: 05.05.2021 | Unit: Item | Stock delivered: 200
    public static void choiseOperation() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select with NUMBER the operation you want to be performed:\n");
        System.out.println("    1): List all items");
        System.out.println("    2): Add new delivery");
        System.out.println("    3): List deliveries for time period \n");
        System.out.print("Pending your choice: ");
    }
