import java.util.Date;

class DateUtil {


    static boolean isNotIntersect(Date oldBegin, Date oldEnd, Date newBegin, Date newEnd) {
        return newBegin.compareTo(oldEnd) > 0 || newEnd.compareTo(oldBegin) < 0;
    }

    static boolean firstIntersect(Date oldBegin, Date oldEnd, Date newBegin, Date newEnd) {
        return newBegin.compareTo(oldBegin) <= 0 && newEnd.compareTo(oldEnd) < 0;
    }

    static boolean secondIntersect(Date oldBegin, Date oldEnd, Date newBegin, Date newEnd) {
        return newBegin.compareTo(oldBegin) > 0 && newEnd.compareTo(oldEnd) < 0;
    }

    static boolean thirdIntersect(Date oldBegin, Date oldEnd, Date newBegin, Date newEnd) {
        return newBegin.compareTo(oldBegin) > 0 && newEnd.compareTo(oldEnd) >= 0;
    }

    static boolean proxyIntersectLastElement(Date proxyBegin, Date proxyEnd, Date newBegin, Date newEnd){
        return newBegin.compareTo(proxyBegin) < 0 && newEnd.compareTo(proxyEnd) < 0 && newEnd.compareTo(proxyBegin) > 0;
    }

    static boolean proxyIntersectMiddleElement(Date proxyBegin, Date proxyEnd, Date newEnd){
        return proxyBegin.compareTo(newEnd) < 0 && newEnd.compareTo(proxyEnd) == 0;
    }
}