import java.text.SimpleDateFormat
import java.util.*


fun main() {
    println("Программа лояльности магазина МЕЛОМАН")
//    val sdf1 = SimpleDateFormat("dd.MM.yyyy")
    val sdf1 = SimpleDateFormat("MM")
    val currentDate: String = sdf1.format(Date())
    System.out.println(" C DATE is  $currentDate")


    //Так как четких условий реализации задания нету, мной было принято решение сделать что-то
    // на подобии backend программы лояльности
    println("Введите сумму покупки, для расчета скидки по программе лояльности")
    val entercash = readLine()
    val entercashdouble = entercash?.toDouble()

    println("Введите месяц покупки в формате ММ (01)")
    val entermonth: String? = readLine()


    println("На основании введенного условия, реультат:")

    val leveldoscount = if (entermonth?.toInt() == currentDate?.toInt()) {
        when (entercashdouble!!) {
            in 1.1..1000.0 -> entercashdouble?.minus(((entercashdouble!! * 1) / 100))
            in 1001.0..10000.0 -> (entercashdouble?.minus(100)?.minus(((entercashdouble!! * 1) / 100)))
            in 10001.0..9999999.0 -> entercashdouble?.minus(((entercashdouble!! * 5) / 100)?.minus(entercashdouble!! * 1) / 100)
            else -> "hhhh"
        }
    } else {
        when (entercashdouble!!) {
            in 1.1..1000.0 -> entercashdouble
            in 1001.0..10000.0 -> entercashdouble?.minus(100)
            in 10001.0..9999999.0 -> entercashdouble?.minus(((entercashdouble!! * 5) / 100))
            else -> "HEllo"
        }
    }

    println(leveldoscount)
}




