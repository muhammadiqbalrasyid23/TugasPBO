const prompt = require('prompt-sync')()
//Constructor Penumpang
        function Penumpang(nama, jurusan, tempatduduk, harga, terminalawal){
        this.nama = nama
        this.jurusan = jurusan
        this.tempatduduk = tempatduduk
        this.harga = harga
        this.terminalawal = terminalawal

        // Fungsi untuk menampilkan
        this.tampil = function(){
        console.log('Nama Penumpang\t\t\t: ', this.nama)
        console.log('Jurusan\t\t\t: ', this.jurusan)
        console.log('Tempat Duduk\t\t\t: ', this.tempatduduk)
        console.log('Harga\t\t\t\t: ', this.harga)
        console.log('Terminal Awal\t: ', this.terminalawal)
        }
        }

// Array
        var array = [] // Deklarasi array tanpa value
// Object 
        var penumpang = {} // Deklarasi object tanpa value

        var cek = false
//Menampilkan Menu pilihan
        do{
        console.log('==========Pencatatan Pemberangkatan Bus==========')
        console.log()

        console.log('Menu :')
        console.log('1. Tambah Penumpang')
        console.log('2. Edit Penumpang')
        console.log('3. Tampilkan Penumpang')
        console.log('4. Exit')
        console.log()
        let pil = prompt('Masukkan Pilihan Menu\t: ')

        console.log()
//Menampilkan menu Pilihan 1
        if(pil == 1){
        let jmlPenumpang = prompt('Masukkan Jumlah Penumpang\t: ')

        for (let i = 0; i < jmlPenumpang; i++) {
        console.log(`\nPenumpang ke-${i}`);
        penumpang = new Penumpang(
        prompt(`Nama Penumpang\t\t\t: `),
        prompt(`Jurusan\t\t\t: `),
        prompt(`Tempat Duduk\t\t\t: `),
        prompt(`Harga\t\t\t\t: `),
        prompt(`Terminal Awal\t: `)
        )
        array.push(penumpang)
        }
        console.log()

        }else if(pil == 2){
        var noPenumpang = prompt('Masukkan Nomer Urut Penumpang\t: ')

        // Tambah fungsi baru ke constructor
        Penumpang.prototype.edit = function(){
        nama = prompt(`Nama Penumpang\t\t\t: `),
        jurusan = prompt(`Jurusan\t\t\t: `),
        tempatduduk = prompt(`Tempat Duduk\t\t\t: `),
        harga = prompt(`Harga\t\t\t\t: `),
        terminalawal = prompt(`Terminal Awal\t: `),
        tampil = this.tampil
        return {nama, jurusan, tempatduduk, harga, terminalawal, tampil}
        }

        let index = noPenumpang-1
        array[index] = array[index].edit()

        console.log('\nData Berhasil Dirubah')
        console.log()

        }else if(pil == 3){
        index = 1

        // Mencetak output program
        for (let x in array){
        console.log(`\nPenumpang ke-${index}`);
        index++;
        array[x].tampil()
        }
        console.log()

        }else if(pil == 4){
        cek = true
        console.log('Terima Kasih !!!')
        //Jika Pilihan input tidak sesuai
        }else{
        console.log('Maaf inputan Anda Tidak Sesuai')
        console.log()
        }
        }while(!cek)