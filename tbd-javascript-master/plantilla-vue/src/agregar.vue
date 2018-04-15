 <template>
  <div class="center">
    <h2>{{title}}</h2>
    <div id="agregarActor">
        <form>
          <div>
            <input name = "fist" type="text" placeholder="First name" v-model="actor.firstName">
          
          </div>
          <em style="color:#FF0000">{{error.error1}}</em>
           <p></p>
          <div>
            <input name = "last" type="text" placeholder="Last name" v-model="actor.lastName">
          </div>
          <em style="color:#FF0000">{{error.error2}}</em>
          <p></p>
            <button v-on:click.prevent="post" type=submit >Agregar</button>

          <p v-if="validador1">No se enviaron los datos</p>

          <p v-if="validador2"> Se agrega el actor correctamente </p>
        </form>
    </div>
  </div>
</template>

<script>
export default {
  data(){
    return{
      title:'Agregar Actor',
      actor:{
        firstName:"",
        lastName:""
      },
      validador1:false,
      validador2:false,
      error:{
        error1:"",
        error2:""
      }
      
    }
  },
  methods:{
      post(){
        if(this.actor.firstName != "" && this.actor.lastName != ""){
          this.error.error1 = "";
          this.error.error2 = "";
          console.log(this.actor.firstName);
          console.log(this.actor.lastName);
          this.$http.post('http://localhost:8081/sakila-spring-backend/actors/',this.actor)
          .then(function(response){
              this.actor.firstName="";
              this.actor.lastName="";
              this.validador1=false;
              this.validador2=true;
              
          },
          function(response){
              this.validador1=true;
              this.validador2=false;
          }
          
          );
        }
        else{
          this.error.error1 = "";
          this.error.error2 = "";
          if(this.actor.firstName == ""){
           this.error.error1 = "*campo vacio";
          }
          if(this.actor.lastName == ""){
            this.error.error2 = "*campo vacio";
          }
        }
      }
  }
}
</script>