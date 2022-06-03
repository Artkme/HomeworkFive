package ge.ufc.square;

import ge.ufc.main.Rectangle;

public final class Square extends Rectangle {
    private double side;

    private void setSide(double side) {
        this.side = side;
    }


    /* როგორც პირობაშია ნახსენები, მეცხრამეტე ლაინზე უნდა გამოვიძახოთ მშობელი კლასის ანუ სუპერკლასის გადაფარული მეთოდი
    და ამიტომ ვიძახებთ პერიმეტრის უპარამეტრო მეთოდს, რადგან მშობელ კლასში პარამეტრიანი მეთოდი არის
    გადატვირთული და არა გადაფარული. იგივე შემთხვევა გვაქვს area()-ს მეთოდზეც 24-ე ლაინზე. */

    @Override
    protected double perimeter() {
        return super.perimeter();
    }

    @Override
    protected double area() {
        return super.area();
    }
}
