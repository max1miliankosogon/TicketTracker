fun main(args: Array<String>) {
    println("Введіть ваше ім'я")
    var name : String? = readLine()

    println("Введіть вашу стать (чол, жін)")
    var sex : String? = readLine()
    if (sex == "чол"){
        println("Введіть ваш вік")
        val inputAge1 : String? = readLine()
        val age1 = inputAge1?.toInt()
        if (age1 != null) {
            if (age1 in 18..65){
                println("Ви можете замовити квиток")
            }else if(age1 in 0 .. 17 || age1 in 66 .. 120){
                println("На жаль, через вікові обмеження, ви не можете придбати квиток")
            }else{
                println("Ви некоректно вказали вік, будь ласка спробуйте ще раз!")
            }
        }


    }else if(sex == "жін"){
        println("Введіть ваш вік")
        val inputAge2 : String? = readLine()
        val age2 = inputAge2?.toInt()
        if (age2 != null) {
            if (age2 in 21.. 120 ){
                println("Ви можете замовити квиток")
            }else if (age2 in 0 .. 20){
                println("На жаль, через вікові обмеження, ви не можете придбати квиток")
            }else{
                println("Ви некоректно вказали вік, будь ласка спробуйте ще раз!")
            }
        }
    }else{
        println("Ви ввели неправильну стать, вкаіжть стать - чол або жін")
    }



}