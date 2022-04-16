const val item = 13F
const val PRICE = 100
const val START_DISCOUNT_1 = 1000
const val START_DISCOUNT_2 = 10000
const val DISCOUNT = 100
const val DISCOUNT_PERCENT = 5
const val DISCOUNT_MELOMAN = 1
const val meloman: Boolean = true

fun main() {
    val totalPrice = PRICE * item
    var totalSumm: Float =
        if (totalPrice > START_DISCOUNT_2) totalPrice - (totalPrice * DISCOUNT_PERCENT / 100)
        else if (totalPrice > START_DISCOUNT_1 && totalPrice < START_DISCOUNT_2) totalPrice - DISCOUNT
        else totalPrice
    totalSumm = if (meloman) totalSumm - (totalSumm * DISCOUNT_MELOMAN / 100) else totalSumm
    print("Сумма покупки с учетом скидок составила: $totalSumm руб.")
}