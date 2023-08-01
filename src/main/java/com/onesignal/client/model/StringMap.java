/*
 * OneSignal
 * A powerful way to send personalized messages at scale and build effective customer engagement strategies. Learn more at onesignal.com
 *
 * The version of the OpenAPI document: 1.2.2
 * Contact: devrel@onesignal.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.onesignal.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.onesignal.client.JSON;

/**
 * StringMap
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-01T23:27:12.168Z[Etc/UTC]")
public class StringMap {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_EN = "en";
  @SerializedName(SERIALIZED_NAME_EN)
  private String en;

  public static final String SERIALIZED_NAME_AR = "ar";
  @SerializedName(SERIALIZED_NAME_AR)
  private String ar;

  public static final String SERIALIZED_NAME_BS = "bs";
  @SerializedName(SERIALIZED_NAME_BS)
  private String bs;

  public static final String SERIALIZED_NAME_BG = "bg";
  @SerializedName(SERIALIZED_NAME_BG)
  private String bg;

  public static final String SERIALIZED_NAME_CA = "ca";
  @SerializedName(SERIALIZED_NAME_CA)
  private String ca;

  public static final String SERIALIZED_NAME_ZH_HANS = "zh-Hans";
  @SerializedName(SERIALIZED_NAME_ZH_HANS)
  private String zhHans;

  public static final String SERIALIZED_NAME_ZH_HANT = "zh-Hant";
  @SerializedName(SERIALIZED_NAME_ZH_HANT)
  private String zhHant;

  public static final String SERIALIZED_NAME_ZH = "zh";
  @SerializedName(SERIALIZED_NAME_ZH)
  private String zh;

  public static final String SERIALIZED_NAME_HR = "hr";
  @SerializedName(SERIALIZED_NAME_HR)
  private String hr;

  public static final String SERIALIZED_NAME_CS = "cs";
  @SerializedName(SERIALIZED_NAME_CS)
  private String cs;

  public static final String SERIALIZED_NAME_DA = "da";
  @SerializedName(SERIALIZED_NAME_DA)
  private String da;

  public static final String SERIALIZED_NAME_NL = "nl";
  @SerializedName(SERIALIZED_NAME_NL)
  private String nl;

  public static final String SERIALIZED_NAME_ET = "et";
  @SerializedName(SERIALIZED_NAME_ET)
  private String et;

  public static final String SERIALIZED_NAME_FI = "fi";
  @SerializedName(SERIALIZED_NAME_FI)
  private String fi;

  public static final String SERIALIZED_NAME_FR = "fr";
  @SerializedName(SERIALIZED_NAME_FR)
  private String fr;

  public static final String SERIALIZED_NAME_KA = "ka";
  @SerializedName(SERIALIZED_NAME_KA)
  private String ka;

  public static final String SERIALIZED_NAME_DE = "de";
  @SerializedName(SERIALIZED_NAME_DE)
  private String de;

  public static final String SERIALIZED_NAME_EL = "el";
  @SerializedName(SERIALIZED_NAME_EL)
  private String el;

  public static final String SERIALIZED_NAME_HI = "hi";
  @SerializedName(SERIALIZED_NAME_HI)
  private String hi;

  public static final String SERIALIZED_NAME_HE = "he";
  @SerializedName(SERIALIZED_NAME_HE)
  private String he;

  public static final String SERIALIZED_NAME_HU = "hu";
  @SerializedName(SERIALIZED_NAME_HU)
  private String hu;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IT = "it";
  @SerializedName(SERIALIZED_NAME_IT)
  private String it;

  public static final String SERIALIZED_NAME_JA = "ja";
  @SerializedName(SERIALIZED_NAME_JA)
  private String ja;

  public static final String SERIALIZED_NAME_KO = "ko";
  @SerializedName(SERIALIZED_NAME_KO)
  private String ko;

  public static final String SERIALIZED_NAME_LV = "lv";
  @SerializedName(SERIALIZED_NAME_LV)
  private String lv;

  public static final String SERIALIZED_NAME_LT = "lt";
  @SerializedName(SERIALIZED_NAME_LT)
  private String lt;

  public static final String SERIALIZED_NAME_MS = "ms";
  @SerializedName(SERIALIZED_NAME_MS)
  private String ms;

  public static final String SERIALIZED_NAME_NB = "nb";
  @SerializedName(SERIALIZED_NAME_NB)
  private String nb;

  public static final String SERIALIZED_NAME_PL = "pl";
  @SerializedName(SERIALIZED_NAME_PL)
  private String pl;

  public static final String SERIALIZED_NAME_FA = "fa";
  @SerializedName(SERIALIZED_NAME_FA)
  private String fa;

  public static final String SERIALIZED_NAME_PT = "pt";
  @SerializedName(SERIALIZED_NAME_PT)
  private String pt;

  public static final String SERIALIZED_NAME_PA = "pa";
  @SerializedName(SERIALIZED_NAME_PA)
  private String pa;

  public static final String SERIALIZED_NAME_RO = "ro";
  @SerializedName(SERIALIZED_NAME_RO)
  private String ro;

  public static final String SERIALIZED_NAME_RU = "ru";
  @SerializedName(SERIALIZED_NAME_RU)
  private String ru;

  public static final String SERIALIZED_NAME_SR = "sr";
  @SerializedName(SERIALIZED_NAME_SR)
  private String sr;

  public static final String SERIALIZED_NAME_SK = "sk";
  @SerializedName(SERIALIZED_NAME_SK)
  private String sk;

  public static final String SERIALIZED_NAME_ES = "es";
  @SerializedName(SERIALIZED_NAME_ES)
  private String es;

  public static final String SERIALIZED_NAME_SV = "sv";
  @SerializedName(SERIALIZED_NAME_SV)
  private String sv;

  public static final String SERIALIZED_NAME_TH = "th";
  @SerializedName(SERIALIZED_NAME_TH)
  private String th;

  public static final String SERIALIZED_NAME_TR = "tr";
  @SerializedName(SERIALIZED_NAME_TR)
  private String tr;

  public static final String SERIALIZED_NAME_UK = "uk";
  @SerializedName(SERIALIZED_NAME_UK)
  private String uk;

  public static final String SERIALIZED_NAME_VI = "vi";
  @SerializedName(SERIALIZED_NAME_VI)
  private String vi;

  public StringMap() { 
  }

  public StringMap en(String en) {
    
    this.en = en;
    return this;
  }

   /**
   * Text in English.  Will be used as a fallback
   * @return en
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in English.  Will be used as a fallback")

  public String getEn() {
    return en;
  }


  public void setEn(String en) {
    this.en = en;
  }


  public StringMap ar(String ar) {
    
    this.ar = ar;
    return this;
  }

   /**
   * Text in Arabic.
   * @return ar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Arabic.")

  public String getAr() {
    return ar;
  }


  public void setAr(String ar) {
    this.ar = ar;
  }


  public StringMap bs(String bs) {
    
    this.bs = bs;
    return this;
  }

   /**
   * Text in Bosnian.
   * @return bs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Bosnian.")

  public String getBs() {
    return bs;
  }


  public void setBs(String bs) {
    this.bs = bs;
  }


  public StringMap bg(String bg) {
    
    this.bg = bg;
    return this;
  }

   /**
   * Text in Bulgarian.
   * @return bg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Bulgarian.")

  public String getBg() {
    return bg;
  }


  public void setBg(String bg) {
    this.bg = bg;
  }


  public StringMap ca(String ca) {
    
    this.ca = ca;
    return this;
  }

   /**
   * Text in Catalan.
   * @return ca
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Catalan.")

  public String getCa() {
    return ca;
  }


  public void setCa(String ca) {
    this.ca = ca;
  }


  public StringMap zhHans(String zhHans) {
    
    this.zhHans = zhHans;
    return this;
  }

   /**
   * Text in Chinese (Simplified).
   * @return zhHans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Chinese (Simplified).")

  public String getZhHans() {
    return zhHans;
  }


  public void setZhHans(String zhHans) {
    this.zhHans = zhHans;
  }


  public StringMap zhHant(String zhHant) {
    
    this.zhHant = zhHant;
    return this;
  }

   /**
   * Text in Chinese (Traditional).
   * @return zhHant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Chinese (Traditional).")

  public String getZhHant() {
    return zhHant;
  }


  public void setZhHant(String zhHant) {
    this.zhHant = zhHant;
  }


  public StringMap zh(String zh) {
    
    this.zh = zh;
    return this;
  }

   /**
   * Alias for zh-Hans.
   * @return zh
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Alias for zh-Hans.")

  public String getZh() {
    return zh;
  }


  public void setZh(String zh) {
    this.zh = zh;
  }


  public StringMap hr(String hr) {
    
    this.hr = hr;
    return this;
  }

   /**
   * Text in Croatian.
   * @return hr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Croatian.")

  public String getHr() {
    return hr;
  }


  public void setHr(String hr) {
    this.hr = hr;
  }


  public StringMap cs(String cs) {
    
    this.cs = cs;
    return this;
  }

   /**
   * Text in Czech.
   * @return cs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Czech.")

  public String getCs() {
    return cs;
  }


  public void setCs(String cs) {
    this.cs = cs;
  }


  public StringMap da(String da) {
    
    this.da = da;
    return this;
  }

   /**
   * Text in Danish.
   * @return da
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Danish.")

  public String getDa() {
    return da;
  }


  public void setDa(String da) {
    this.da = da;
  }


  public StringMap nl(String nl) {
    
    this.nl = nl;
    return this;
  }

   /**
   * Text in Dutch.
   * @return nl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Dutch.")

  public String getNl() {
    return nl;
  }


  public void setNl(String nl) {
    this.nl = nl;
  }


  public StringMap et(String et) {
    
    this.et = et;
    return this;
  }

   /**
   * Text in Estonian.
   * @return et
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Estonian.")

  public String getEt() {
    return et;
  }


  public void setEt(String et) {
    this.et = et;
  }


  public StringMap fi(String fi) {
    
    this.fi = fi;
    return this;
  }

   /**
   * Text in Finnish.
   * @return fi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Finnish.")

  public String getFi() {
    return fi;
  }


  public void setFi(String fi) {
    this.fi = fi;
  }


  public StringMap fr(String fr) {
    
    this.fr = fr;
    return this;
  }

   /**
   * Text in French.
   * @return fr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in French.")

  public String getFr() {
    return fr;
  }


  public void setFr(String fr) {
    this.fr = fr;
  }


  public StringMap ka(String ka) {
    
    this.ka = ka;
    return this;
  }

   /**
   * Text in Georgian.
   * @return ka
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Georgian.")

  public String getKa() {
    return ka;
  }


  public void setKa(String ka) {
    this.ka = ka;
  }


  public StringMap de(String de) {
    
    this.de = de;
    return this;
  }

   /**
   * Text in German.
   * @return de
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in German.")

  public String getDe() {
    return de;
  }


  public void setDe(String de) {
    this.de = de;
  }


  public StringMap el(String el) {
    
    this.el = el;
    return this;
  }

   /**
   * Text in Greek.
   * @return el
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Greek.")

  public String getEl() {
    return el;
  }


  public void setEl(String el) {
    this.el = el;
  }


  public StringMap hi(String hi) {
    
    this.hi = hi;
    return this;
  }

   /**
   * Text in Hindi.
   * @return hi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Hindi.")

  public String getHi() {
    return hi;
  }


  public void setHi(String hi) {
    this.hi = hi;
  }


  public StringMap he(String he) {
    
    this.he = he;
    return this;
  }

   /**
   * Text in Hebrew.
   * @return he
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Hebrew.")

  public String getHe() {
    return he;
  }


  public void setHe(String he) {
    this.he = he;
  }


  public StringMap hu(String hu) {
    
    this.hu = hu;
    return this;
  }

   /**
   * Text in Hungarian.
   * @return hu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Hungarian.")

  public String getHu() {
    return hu;
  }


  public void setHu(String hu) {
    this.hu = hu;
  }


  public StringMap id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Text in Indonesian.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Indonesian.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public StringMap it(String it) {
    
    this.it = it;
    return this;
  }

   /**
   * Text in Italian.
   * @return it
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Italian.")

  public String getIt() {
    return it;
  }


  public void setIt(String it) {
    this.it = it;
  }


  public StringMap ja(String ja) {
    
    this.ja = ja;
    return this;
  }

   /**
   * Text in Japanese.
   * @return ja
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Japanese.")

  public String getJa() {
    return ja;
  }


  public void setJa(String ja) {
    this.ja = ja;
  }


  public StringMap ko(String ko) {
    
    this.ko = ko;
    return this;
  }

   /**
   * Text in Korean.
   * @return ko
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Korean.")

  public String getKo() {
    return ko;
  }


  public void setKo(String ko) {
    this.ko = ko;
  }


  public StringMap lv(String lv) {
    
    this.lv = lv;
    return this;
  }

   /**
   * Text in Latvian.
   * @return lv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Latvian.")

  public String getLv() {
    return lv;
  }


  public void setLv(String lv) {
    this.lv = lv;
  }


  public StringMap lt(String lt) {
    
    this.lt = lt;
    return this;
  }

   /**
   * Text in Lithuanian.
   * @return lt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Lithuanian.")

  public String getLt() {
    return lt;
  }


  public void setLt(String lt) {
    this.lt = lt;
  }


  public StringMap ms(String ms) {
    
    this.ms = ms;
    return this;
  }

   /**
   * Text in Malay.
   * @return ms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Malay.")

  public String getMs() {
    return ms;
  }


  public void setMs(String ms) {
    this.ms = ms;
  }


  public StringMap nb(String nb) {
    
    this.nb = nb;
    return this;
  }

   /**
   * Text in Norwegian.
   * @return nb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Norwegian.")

  public String getNb() {
    return nb;
  }


  public void setNb(String nb) {
    this.nb = nb;
  }


  public StringMap pl(String pl) {
    
    this.pl = pl;
    return this;
  }

   /**
   * Text in Polish.
   * @return pl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Polish.")

  public String getPl() {
    return pl;
  }


  public void setPl(String pl) {
    this.pl = pl;
  }


  public StringMap fa(String fa) {
    
    this.fa = fa;
    return this;
  }

   /**
   * Text in Persian.
   * @return fa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Persian.")

  public String getFa() {
    return fa;
  }


  public void setFa(String fa) {
    this.fa = fa;
  }


  public StringMap pt(String pt) {
    
    this.pt = pt;
    return this;
  }

   /**
   * Text in Portugese.
   * @return pt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Portugese.")

  public String getPt() {
    return pt;
  }


  public void setPt(String pt) {
    this.pt = pt;
  }


  public StringMap pa(String pa) {
    
    this.pa = pa;
    return this;
  }

   /**
   * Text in Punjabi.
   * @return pa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Punjabi.")

  public String getPa() {
    return pa;
  }


  public void setPa(String pa) {
    this.pa = pa;
  }


  public StringMap ro(String ro) {
    
    this.ro = ro;
    return this;
  }

   /**
   * Text in Romanian.
   * @return ro
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Romanian.")

  public String getRo() {
    return ro;
  }


  public void setRo(String ro) {
    this.ro = ro;
  }


  public StringMap ru(String ru) {
    
    this.ru = ru;
    return this;
  }

   /**
   * Text in Russian.
   * @return ru
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Russian.")

  public String getRu() {
    return ru;
  }


  public void setRu(String ru) {
    this.ru = ru;
  }


  public StringMap sr(String sr) {
    
    this.sr = sr;
    return this;
  }

   /**
   * Text in Serbian.
   * @return sr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Serbian.")

  public String getSr() {
    return sr;
  }


  public void setSr(String sr) {
    this.sr = sr;
  }


  public StringMap sk(String sk) {
    
    this.sk = sk;
    return this;
  }

   /**
   * Text in Slovak.
   * @return sk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Slovak.")

  public String getSk() {
    return sk;
  }


  public void setSk(String sk) {
    this.sk = sk;
  }


  public StringMap es(String es) {
    
    this.es = es;
    return this;
  }

   /**
   * Text in Spanish.
   * @return es
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Spanish.")

  public String getEs() {
    return es;
  }


  public void setEs(String es) {
    this.es = es;
  }


  public StringMap sv(String sv) {
    
    this.sv = sv;
    return this;
  }

   /**
   * Text in Swedish.
   * @return sv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Swedish.")

  public String getSv() {
    return sv;
  }


  public void setSv(String sv) {
    this.sv = sv;
  }


  public StringMap th(String th) {
    
    this.th = th;
    return this;
  }

   /**
   * Text in Thai.
   * @return th
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Thai.")

  public String getTh() {
    return th;
  }


  public void setTh(String th) {
    this.th = th;
  }


  public StringMap tr(String tr) {
    
    this.tr = tr;
    return this;
  }

   /**
   * Text in Turkish.
   * @return tr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Turkish.")

  public String getTr() {
    return tr;
  }


  public void setTr(String tr) {
    this.tr = tr;
  }


  public StringMap uk(String uk) {
    
    this.uk = uk;
    return this;
  }

   /**
   * Text in Ukrainian.
   * @return uk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Ukrainian.")

  public String getUk() {
    return uk;
  }


  public void setUk(String uk) {
    this.uk = uk;
  }


  public StringMap vi(String vi) {
    
    this.vi = vi;
    return this;
  }

   /**
   * Text in Vietnamese.
   * @return vi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text in Vietnamese.")

  public String getVi() {
    return vi;
  }


  public void setVi(String vi) {
    this.vi = vi;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringMap stringMap = (StringMap) o;
    return Objects.equals(this.en, stringMap.en) &&
        Objects.equals(this.ar, stringMap.ar) &&
        Objects.equals(this.bs, stringMap.bs) &&
        Objects.equals(this.bg, stringMap.bg) &&
        Objects.equals(this.ca, stringMap.ca) &&
        Objects.equals(this.zhHans, stringMap.zhHans) &&
        Objects.equals(this.zhHant, stringMap.zhHant) &&
        Objects.equals(this.zh, stringMap.zh) &&
        Objects.equals(this.hr, stringMap.hr) &&
        Objects.equals(this.cs, stringMap.cs) &&
        Objects.equals(this.da, stringMap.da) &&
        Objects.equals(this.nl, stringMap.nl) &&
        Objects.equals(this.et, stringMap.et) &&
        Objects.equals(this.fi, stringMap.fi) &&
        Objects.equals(this.fr, stringMap.fr) &&
        Objects.equals(this.ka, stringMap.ka) &&
        Objects.equals(this.de, stringMap.de) &&
        Objects.equals(this.el, stringMap.el) &&
        Objects.equals(this.hi, stringMap.hi) &&
        Objects.equals(this.he, stringMap.he) &&
        Objects.equals(this.hu, stringMap.hu) &&
        Objects.equals(this.id, stringMap.id) &&
        Objects.equals(this.it, stringMap.it) &&
        Objects.equals(this.ja, stringMap.ja) &&
        Objects.equals(this.ko, stringMap.ko) &&
        Objects.equals(this.lv, stringMap.lv) &&
        Objects.equals(this.lt, stringMap.lt) &&
        Objects.equals(this.ms, stringMap.ms) &&
        Objects.equals(this.nb, stringMap.nb) &&
        Objects.equals(this.pl, stringMap.pl) &&
        Objects.equals(this.fa, stringMap.fa) &&
        Objects.equals(this.pt, stringMap.pt) &&
        Objects.equals(this.pa, stringMap.pa) &&
        Objects.equals(this.ro, stringMap.ro) &&
        Objects.equals(this.ru, stringMap.ru) &&
        Objects.equals(this.sr, stringMap.sr) &&
        Objects.equals(this.sk, stringMap.sk) &&
        Objects.equals(this.es, stringMap.es) &&
        Objects.equals(this.sv, stringMap.sv) &&
        Objects.equals(this.th, stringMap.th) &&
        Objects.equals(this.tr, stringMap.tr) &&
        Objects.equals(this.uk, stringMap.uk) &&
        Objects.equals(this.vi, stringMap.vi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(en, ar, bs, bg, ca, zhHans, zhHant, zh, hr, cs, da, nl, et, fi, fr, ka, de, el, hi, he, hu, id, it, ja, ko, lv, lt, ms, nb, pl, fa, pt, pa, ro, ru, sr, sk, es, sv, th, tr, uk, vi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringMap {\n");
    sb.append("    en: ").append(toIndentedString(en)).append("\n");
    sb.append("    ar: ").append(toIndentedString(ar)).append("\n");
    sb.append("    bs: ").append(toIndentedString(bs)).append("\n");
    sb.append("    bg: ").append(toIndentedString(bg)).append("\n");
    sb.append("    ca: ").append(toIndentedString(ca)).append("\n");
    sb.append("    zhHans: ").append(toIndentedString(zhHans)).append("\n");
    sb.append("    zhHant: ").append(toIndentedString(zhHant)).append("\n");
    sb.append("    zh: ").append(toIndentedString(zh)).append("\n");
    sb.append("    hr: ").append(toIndentedString(hr)).append("\n");
    sb.append("    cs: ").append(toIndentedString(cs)).append("\n");
    sb.append("    da: ").append(toIndentedString(da)).append("\n");
    sb.append("    nl: ").append(toIndentedString(nl)).append("\n");
    sb.append("    et: ").append(toIndentedString(et)).append("\n");
    sb.append("    fi: ").append(toIndentedString(fi)).append("\n");
    sb.append("    fr: ").append(toIndentedString(fr)).append("\n");
    sb.append("    ka: ").append(toIndentedString(ka)).append("\n");
    sb.append("    de: ").append(toIndentedString(de)).append("\n");
    sb.append("    el: ").append(toIndentedString(el)).append("\n");
    sb.append("    hi: ").append(toIndentedString(hi)).append("\n");
    sb.append("    he: ").append(toIndentedString(he)).append("\n");
    sb.append("    hu: ").append(toIndentedString(hu)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    it: ").append(toIndentedString(it)).append("\n");
    sb.append("    ja: ").append(toIndentedString(ja)).append("\n");
    sb.append("    ko: ").append(toIndentedString(ko)).append("\n");
    sb.append("    lv: ").append(toIndentedString(lv)).append("\n");
    sb.append("    lt: ").append(toIndentedString(lt)).append("\n");
    sb.append("    ms: ").append(toIndentedString(ms)).append("\n");
    sb.append("    nb: ").append(toIndentedString(nb)).append("\n");
    sb.append("    pl: ").append(toIndentedString(pl)).append("\n");
    sb.append("    fa: ").append(toIndentedString(fa)).append("\n");
    sb.append("    pt: ").append(toIndentedString(pt)).append("\n");
    sb.append("    pa: ").append(toIndentedString(pa)).append("\n");
    sb.append("    ro: ").append(toIndentedString(ro)).append("\n");
    sb.append("    ru: ").append(toIndentedString(ru)).append("\n");
    sb.append("    sr: ").append(toIndentedString(sr)).append("\n");
    sb.append("    sk: ").append(toIndentedString(sk)).append("\n");
    sb.append("    es: ").append(toIndentedString(es)).append("\n");
    sb.append("    sv: ").append(toIndentedString(sv)).append("\n");
    sb.append("    th: ").append(toIndentedString(th)).append("\n");
    sb.append("    tr: ").append(toIndentedString(tr)).append("\n");
    sb.append("    uk: ").append(toIndentedString(uk)).append("\n");
    sb.append("    vi: ").append(toIndentedString(vi)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("en");
    openapiFields.add("ar");
    openapiFields.add("bs");
    openapiFields.add("bg");
    openapiFields.add("ca");
    openapiFields.add("zh-Hans");
    openapiFields.add("zh-Hant");
    openapiFields.add("zh");
    openapiFields.add("hr");
    openapiFields.add("cs");
    openapiFields.add("da");
    openapiFields.add("nl");
    openapiFields.add("et");
    openapiFields.add("fi");
    openapiFields.add("fr");
    openapiFields.add("ka");
    openapiFields.add("de");
    openapiFields.add("el");
    openapiFields.add("hi");
    openapiFields.add("he");
    openapiFields.add("hu");
    openapiFields.add("id");
    openapiFields.add("it");
    openapiFields.add("ja");
    openapiFields.add("ko");
    openapiFields.add("lv");
    openapiFields.add("lt");
    openapiFields.add("ms");
    openapiFields.add("nb");
    openapiFields.add("pl");
    openapiFields.add("fa");
    openapiFields.add("pt");
    openapiFields.add("pa");
    openapiFields.add("ro");
    openapiFields.add("ru");
    openapiFields.add("sr");
    openapiFields.add("sk");
    openapiFields.add("es");
    openapiFields.add("sv");
    openapiFields.add("th");
    openapiFields.add("tr");
    openapiFields.add("uk");
    openapiFields.add("vi");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StringMap.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StringMap' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StringMap> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StringMap.class));

       return (TypeAdapter<T>) new TypeAdapter<StringMap>() {
           @Override
           public void write(JsonWriter out, StringMap value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StringMap read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StringMap given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StringMap
  * @throws IOException if the JSON string is invalid with respect to StringMap
  */
  public static StringMap fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StringMap.class);
  }

 /**
  * Convert an instance of StringMap to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

