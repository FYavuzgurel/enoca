# enoca
PROJE YAPISI
Projede yazarların ( author tablosu ) ve eserlerinin (book tablosu) tutulduğu 2 tablo yer almaktadır.                                 
Book tablosu  author tablosuna ManyToOne şeklinde bağlıdır. Projede veri tabanı olarak PostgreSQL’i local olarak kullandım.          
Entity-DTO dönüşümleri için ModelMapper Kütüphanesini kullandım. http://localhost:8085/api/v1/.... ile controller katmanına erişilebilir.
Entity diagramı aşağıda verilmiştir.


<img src="https://github.com/FYavuzgurel/enoca/blob/main/.idea/table.png" width="auto">




7- Apache Solr servisine yazılacak bir query örneği Apache Solr kullanılan sql programlarından daha farklı runtime bir database. Solr a hali hazırda kayıtlı bir alan olduğunu düşünelim. Alanın ismi “updatedAt” long tipinde tutulan bir alan. Ben 2020 Ocak ayından sonraki verileri getir dediğimde solr a nasıl bir query yazılmalı. http://example?query= kısmını nasıl doldurmalıyım?

Burada http://example/solr/collection/select kısmı Solr sorgu endpoint'inin URL'sidir.
q: Sorgu parametresidir ve updatedAt alanı için belirli bir tarih aralığı sorgusu içerir.
cevap:
http://example/solr/collection/select?q=updatedAt:[2020-01-01T00:00:00Z TO *]
