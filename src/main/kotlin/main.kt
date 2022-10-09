fun main() {
    val currency = "RUB"
    val amount = 5000
    val minCommission = 35
    val commissionPercent = 0.0075

    var commissionOfTransfer = amount * commissionPercent
    if (amount * commissionPercent < minCommission) {
        commissionOfTransfer = minCommission.toDouble()
    }
    println("При переводе $amount $currency комиссия составит $commissionOfTransfer $currency")
}